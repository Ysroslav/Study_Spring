package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.bodrov.staffskill.spring.model.AnswerEnt;
import ru.bodrov.staffskill.spring.model.DepartmentEnt;
import java.util.List;

public class DepartmentRepository extends AbstractRepository<DepartmentEnt>{

    @NotNull
    public static final String NAME = "departmentRepository";

    @NotNull
    public DepartmentEnt findOne(final String id){return entityManager.find(DepartmentEnt.class,id);}

    @Nullable
    public DepartmentEnt getById(final String id){
        if(id==null || id.isEmpty()) return null;
        return getEntity(entityManager.createQuery("SELECT e FROM DepartmentEnt WHERE e.id = :id", DepartmentEnt.class)
                .setParameter("id", id)
                .setMaxResults(1));
    }

    @NotNull
    public List<DepartmentEnt> findAll(){
        return entityManager.createQuery("SELECT e FROM DepartmentEnt", DepartmentEnt.class).getResultList();
    }

    @NotNull
    public DepartmentEnt removeById(final String id){
        final DepartmentEnt department = findOne(id);
        entityManager.remove(department);
        return department;
    }

    public void removeAll(){
        entityManager.createQuery("DELETE FROM DepartmentEnt");
    }
}
