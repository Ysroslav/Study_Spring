package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.bodrov.staffskill.spring.model.QuestionAnswerEnt;

import java.util.List;

public class QuestionAnswerRepository extends AbstractRepository<QuestionAnswerEnt> {

    @NotNull
    public static final String NAME = "questionAnswerRepository";

    @NotNull
    public QuestionAnswerEnt findOne(final String id){return entityManager.find(QuestionAnswerEnt.class,id);}

    @Nullable
    public QuestionAnswerEnt getById(final String id){
        if(id==null || id.isEmpty()) return null;
        return getEntity(entityManager.createQuery("SELECT e FROM QuestionAnswerEnt WHERE e.id = :id", QuestionAnswerEnt.class)
                .setParameter("id", id)
                .setMaxResults(1));
    }

    @NotNull
    public List<QuestionAnswerEnt> findAll(){
        return entityManager.createQuery("SELECT e FROM QuestionAnswerEnt", QuestionAnswerEnt.class).getResultList();
    }

    @NotNull
    public QuestionAnswerEnt removeById(final String id){
        final QuestionAnswerEnt quesAns = findOne(id);
        entityManager.remove(quesAns);
        return quesAns;
    }

    public void removeAll(){
        entityManager.createQuery("DELETE FROM QuestionAnswerEnt");
    }
}
