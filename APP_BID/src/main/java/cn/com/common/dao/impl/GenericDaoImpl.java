package cn.com.common.dao.impl;

import cn.com.common.dao.api.GenericDAO;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.List;

public abstract class GenericDaoImpl<T, ID extends Serializable> implements GenericDAO<T, ID> {

    protected Class<T> entityClass;

    protected EntityManager entityManager;

    public GenericDaoImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<T> findAll() {
        CriteriaQuery criteriaQuery = entityManager.getCriteriaBuilder().createQuery(entityClass);
        criteriaQuery.select(criteriaQuery.from(entityClass));
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    public Long getCount() {
        CriteriaQuery<Long> c = entityManager.getCriteriaBuilder().createQuery(Long.class);
        c.select(entityManager.getCriteriaBuilder().count(c.from(entityClass)));
        return entityManager.createQuery(c).getSingleResult();
    }

    public T makePersistent(T entity) {
        return entityManager.merge(entity);
    }

    public T findById(ID id) {
        return findById(id, LockModeType.NONE);
    }

    public T findById(ID id, LockModeType lockModeType) {
        return entityManager.find(entityClass, id, lockModeType);
    }

    public T findReferenceById(ID id) {
        return entityManager.getReference(entityClass, id);
    }

    public void makeTransient(T entity) {
        entityManager.remove(entity);
    }

    public boolean checkVersion(T entity, boolean forceUpdate) {
        return false;
    }
}
