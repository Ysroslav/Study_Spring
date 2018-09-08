package ru.bodrov.staffskill.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_answer")
public class AnswerEnt extends AbstractEntity {

    @Column(name = "answer_text", nullable = false)
    private String answerText;

    @ManyToOne
    private QuestionEnt question;

    @Column(name = "is_right", nullable = false)
    private boolean isRight;

    @Column(name = "ball_value", nullable = false)
    private int ballValue;

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public QuestionEnt getQuestion() {
        return question;
    }

    public void setQuestion(QuestionEnt question) {
        this.question = question;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public int getBallValue() {
        return ballValue;
    }

    public void setBallValue(int ballValue) {
        this.ballValue = ballValue;
    }
}
