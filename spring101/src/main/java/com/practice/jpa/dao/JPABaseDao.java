package com.practice.jpa.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class JPABaseDao<E, I> {
	@PersistenceContext
	EntityManager entityManager;
	Class<E> entityClass;

	@SuppressWarnings("unchecked")
	public JPABaseDao() {
		Type c = this.getClass().getGenericSuperclass();
		entityClass = (Class<E>) ((ParameterizedType) c).getActualTypeArguments()[0];
	}

	public E get(I id) {
		return entityManager.find(entityClass, id);
	}	
	
}
