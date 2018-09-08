package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.bodrov.staffskill.spring.model.QuestionEnt;
import java.util.List;

public class QuestionRepository extends AbstractRepository<QuestionEnt> {

    @NotNull
    public static final String NAME = "questionRepository";

    @NotNull
    public QuestionEnt findOne(final String id){return entityManager.find(QuestionEnt.class,id);}

    @Nullable
    public QuestionEnt getById(final String id){
        if(id==null || id.isEmpty()) return null;
        return getEntity(entityManager.createQuery("SELECT e FROM QuestionEnt WHERE e.id = :id", QuestionEnt.class)
                .setParameter("id", id)
                .setMaxResults(1));
    }

    @NotNull
    public List<QuestionEnt> findAll(){
        return entityManager.createQuery("SELECT e FROM QuestionEnt", QuestionEnt.class).getResultList();
    }

    @NotNull
    public QuestionEnt removeById(final String id){
        final QuestionEnt question = findOne(id);
        entityManager.remove(question);
        return question;
    }

    public void removeAll(){
        entityManager.createQuery("DELETE FROM QuestionEnt");
    }
}
