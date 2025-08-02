package com.mysoapapp.metier.dao;

import java.util.List;

public interface Repository <T> {
	public boolean save(T t);
	public boolean delete(long id);
	public boolean update(T t);
	public List<T> list(T t);
	public T get(int id,T t);
}
