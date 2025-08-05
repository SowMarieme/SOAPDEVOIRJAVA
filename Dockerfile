# Image officielle Tomcat 10.1.43 basée sur OpenJDK 17 (tu peux changer la version Java si besoin)
FROM tomcat:10.1.43-jdk17

# Nettoyer les apps Tomcat par défaut (ROOT, docs, examples...)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copier ton fichier WAR dans webapps/ROOT.war pour que Tomcat déploie à la racine
COPY target/soap.war /usr/local/tomcat/webapps/ROOT.war

# Expose le port 8080 (par défaut dans Tomcat)
EXPOSE 8080

# Commande par défaut, déjà présente dans l'image Tomcat, mais on la met pour clarté
CMD ["catalina.sh", "run"]
