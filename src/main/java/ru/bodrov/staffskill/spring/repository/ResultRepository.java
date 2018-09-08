package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.bodrov.staffskill.spring.model.ResultEnt;
import java.util.List;

public class ResultRepository extends AbstractRepository<ResultEnt> {

    @NotNull
    public static final String NAME = "resultRepository";

    @NotNull
    public ResultEnt findOne(final String id){return entityManager.find(ResultEnt.class,id);}

    @Nullable
    public ResultEnt getById(final String id){
        if(id==null || id.isEmpty()) return null;
        return getEntity(entityManager.createQuery("SELECT e FROM ResultEnt WHERE e.id = :id", ResultEnt.class)
                .setParameter("id", id)
                .setMaxResults(1));
    }

    @NotNull
    public List<ResultEnt> findAll(){
        return entityManager.createQuery("SELECT e FROM ResultEnt", ResultEnt.class).getResultList();
    }

    @NotNull
    public ResultEnt removeById(final String id){
        final ResultEnt result = findOne(id);
        entityManager.remove(result);
        return result;
    }

    public void removeAll(){
        entityManager.createQuery("DELETE FROM ResultEnt");
    }
}
