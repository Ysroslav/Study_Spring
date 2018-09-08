package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.bodrov.staffskill.spring.model.StaffEnt;
import java.util.List;

public class StaffRepository extends AbstractRepository<StaffEnt> {

    @NotNull
    public static final String NAME = "staffRepository";

    @NotNull
    public StaffEnt findOne(final String id){return entityManager.find(StaffEnt.class,id);}

    @Nullable
    public StaffEnt getById(final String id){
        if(id==null || id.isEmpty()) return null;
        return getEntity(entityManager.createQuery("SELECT e FROM StaffEnt WHERE e.id = :id", StaffEnt.class)
                .setParameter("id", id)
                .setMaxResults(1));
    }

    @NotNull
    public List<StaffEnt> findAll(){
        return entityManager.createQuery("SELECT e FROM StaffEnt", StaffEnt.class).getResultList();
    }

    @NotNull
    public StaffEnt removeById(final String id){
        final StaffEnt staff = findOne(id);
        entityManager.remove(staff);
        return staff;
    }

    public void removeAll() {
        entityManager.createQuery("DELETE FROM StaffEnt");
    }
}
