package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.bodrov.staffskill.spring.model.TestStaffEnt;
import java.util.List;

public class TestRepository extends AbstractRepository<TestStaffEnt> {

    @NotNull
    public static final String NAME = "testRepository";

    @NotNull
    public TestStaffEnt findOne(final String id){return entityManager.find(TestStaffEnt.class,id);}

    @Nullable
    public TestStaffEnt getById(final String id){
        if(id==null || id.isEmpty()) return null;
        return getEntity(entityManager.createQuery("SELECT e FROM TestStaffEnt WHERE e.id = :id", TestStaffEnt.class)
            .setParameter("id", id)
            .setMaxResults(1));
    }

    @Nullable
    public TestStaffEnt getByTypeId(final String typeId){
        if(typeId==null || typeId.isEmpty()) return null;
        return getEntity(entityManager.createQuery("SELECT e FROM TestStaffEnt WHERE e.type_id = :typeId", TestStaffEnt.class)
                .setParameter("type_id", typeId)
                .setMaxResults(1));
    }

    @NotNull
    public List<TestStaffEnt> findAll(){
        return entityManager.createQuery("SELECT e FROM TestStaffEnt", TestStaffEnt.class).getResultList();
    }

    @NotNull
    public TestStaffEnt removeById(final String id){
         final TestStaffEnt test = findOne(id);
         entityManager.remove(test);
         return test;
    }

    public void removeAll(){
        entityManager.createQuery("DELETE FROM TestStaffEnt");
    }

    public void removeTypeId(final  String typeId){
        final TestStaffEnt testEnt = getByTypeId(typeId);
        if(testEnt==null) return;
        entityManager.remove(testEnt);
    }
}
