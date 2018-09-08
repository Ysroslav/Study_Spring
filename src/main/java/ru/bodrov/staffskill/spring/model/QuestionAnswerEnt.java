package ru.bodrov.staffskill.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_question_ans")
public class QuestionAnswerEnt extends AbstractEntity {

    @ManyToOne
    private StaffEnt staff;

    @ManyToOne
    private AnswerEnt answer;

    @Column(name = "answer_value", nullable = false)
    private boolean answerValue;

    public StaffEnt getStaff() {
        return staff;
    }

    public void setStaff(StaffEnt staff) {
        this.staff = staff;
    }

    public AnswerEnt getAnswer() {
        return answer;
    }

    public void setAnswer(AnswerEnt answer) {
        this.answer = answer;
    }

    public boolean isAnswerValue() {
        return answerValue;
    }

    public void setAnswerValue(boolean answerValue) {
        this.answerValue = answerValue;
    }
}
