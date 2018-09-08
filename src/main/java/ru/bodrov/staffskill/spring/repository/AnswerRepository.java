package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.bodrov.staffskill.spring.model.AnswerEnt;
import java.util.List;

public class AnswerRepository extends AbstractRepository<AnswerEnt> {

    @NotNull
    public static final String NAME = "answerRepository";

    @NotNull
    public AnswerEnt findOne(final String id){return entityManager.find(AnswerEnt.class,id);}

    @Nullable
    public AnswerEnt getById(final String id){
        if(id==null || id.isEmpty()) return null;
        return getEntity(entityManager.createQuery("SELECT e FROM AnswerEnt WHERE e.id = :id", AnswerEnt.class)
                .setParameter("id", id)
                .setMaxResults(1));
    }

    @NotNull
    public List<AnswerEnt> findAll(){
        return entityManager.createQuery("SELECT e FROM AnswerEnt", AnswerEnt.class).getResultList();
    }

    @NotNull
    public AnswerEnt removeById(final String id){
        final AnswerEnt answer = findOne(id);
        entityManager.remove(answer);
        return answer;
    }

    public void removeAll(){
        entityManager.createQuery("DELETE FROM AnswerEnt");
    }
}
