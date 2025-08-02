package com.mysoapapp.metier.config;

import com.mysoapapp.metier.entity.SectorEntity;
import com.mysoapapp.metier.entity.ClassesEntity; // 🔹 ajoute cette ligne
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static final Logger LOG = LoggerFactory.getLogger(HibernateUtil.class);

	private HibernateUtil() {}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				PropertiesReader reader = new PropertiesReader("database.properties");

				String url = reader.getProperty("db.urlDev");
				String username = reader.getProperty("db.username");
				String password = reader.getProperty("db.password");

				LOG.info("Chargement des propriétés DB : url={}, username={}", url, username);

				Properties settings = new Properties();
				settings.put(AvailableSettings.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(AvailableSettings.URL, url);
				settings.put(AvailableSettings.USER, username);
				settings.put(AvailableSettings.PASS, password);
				settings.put(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				settings.put(AvailableSettings.HBM2DDL_AUTO, "update");
				settings.put(AvailableSettings.SHOW_SQL, "true");
				settings.put(AvailableSettings.FORMAT_SQL, "true");

				Configuration configuration = new Configuration();
				configuration.setProperties(settings);

				// 🔹 Ajout des entités
				configuration.addAnnotatedClass(SectorEntity.class);
				configuration.addAnnotatedClass(ClassesEntity.class); // <- ajoute ton entité ici

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				LOG.info("SessionFactory Hibernate initialisée avec succès.");

			} catch (Exception e) {
				LOG.error("Erreur lors de l'initialisation de Hibernate : {}", e.getMessage(), e);
			}
		}

		return sessionFactory;
	}
}
