package cn.com.common.dao.api;

import javax.persistence.LockModeType;
import java.util.List;

public interface GenericDAO<T, ID> {

    T findById(ID id);

    T findById(ID id, LockModeType lockModeType);

    T findReferenceById(ID id);

    List<T> findAll();

    Long getCount();

    T makePersistent(T entity);

    void makeTransient(T entity);

    boolean checkVersion(T entity, boolean forceUpdate);

}
