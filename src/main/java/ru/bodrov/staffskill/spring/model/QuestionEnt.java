package ru.bodrov.staffskill.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_question")
public class QuestionEnt extends AbstractEntity {

    @Column(name = "question_text", nullable = false)
    private String questionText;

    @ManyToOne
    private TestStaffEnt test;

    @ManyToOne
    private DictQuestionEnt type;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public TestStaffEnt getTest() {
        return test;
    }

    public void setTest(TestStaffEnt test) {
        this.test = test;
    }

    public DictQuestionEnt getType() {
        return type;
    }

    public void setType(DictQuestionEnt type) {
        this.type = type;
    }
}
