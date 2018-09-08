package ru.bodrov.staffskill.spring.repository;

import ru.bodrov.staffskill.spring.model.AbstractEntity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public abstract class AbstractRepository<T extends AbstractEntity> {

    @PersistenceContext
    protected EntityManager entityManager;

    public <T> T getEntity(TypedQuery<T> query){
        final List<T> resultList = query.getResultList();
        if(resultList.isEmpty()){
            return null;
        }
        return resultList.get(0);
    }

    public void persist(T entity){
        if(entity==null) return;
        entityManager.persist(entity);
    }

    public T merge(T entity){
        if(entity==null) return null;
        return entityManager.merge(entity);
    }
}
