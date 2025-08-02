package com.mysoapapp.metier.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mysoapapp.metier.config.HibernateUtil;

public class RepositoryImpl<T> implements Repository<T> {

	private final Class<T> clazz;

	public RepositoryImpl(Class<T> clazz) {
		this.clazz = clazz;
	}

	@Override
	public boolean save(T t) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.save(t);
			tx.commit();
			return true;
		} catch (Exception e) {
			if (tx != null) tx.rollback();
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public boolean delete(long id) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();

			T entity = session.get(clazz, id);
			if (entity != null) {
				session.delete(entity);
				tx.commit();
				return true;
			} else {
				tx.rollback();  // rollback si rien à supprimer
				return false;
			}
		} catch (Exception e) {
			if (tx != null) tx.rollback();
			e.printStackTrace();
			return false;
		}
	}




	@Override
	public boolean update(T t) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.merge(t);
			tx.commit();
			return true;
		} catch (Exception e) {
			if (tx != null) tx.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<T> list(T t) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<T> cq = cb.createQuery(clazz);
			Root<T> root = cq.from(clazz);
			cq.select(root);
			return session.createQuery(cq).getResultList();
		}
	}

	@Override
	public T get(int id, T t) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.get(clazz, id);
		}
	}
}
