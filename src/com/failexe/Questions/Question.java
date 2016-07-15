package com.failexe.Questions;

import com.failexe.List.Content;

/**
 * Created by sebastian.rink on 06.07.2016.
 */

public class Question extends Content {

    private String question;
    private String trueAnswer;
    private String falseAnswer1;
    private String falseAnswer2;
    private String falseAnswer3;
    private int weighting;

    public Question (String q, String ta, String fa1, String fa2, String fa3, int w){
        question = q;
        trueAnswer = ta;
        falseAnswer1 = fa1;
        falseAnswer2 = fa2;
        falseAnswer3 = fa3;
        weighting = w;
    }

    public void printQuestion(){
        System.out.println("Question: " + getQuestion());
        System.out.println("Answer1 " + getTrueAnswer());
        System.out.println("Answer2: " + getFalseAnswer1());
        System.out.println("Answer3: " + getFalseAnswer2());
        System.out.println("Answer4: " + getFalseAnswer3());
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(String trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public String getFalseAnswer1() {
        return falseAnswer1;
    }

    public void setFalseAnswer1(String falseAnswer1) {
        this.falseAnswer1 = falseAnswer1;
    }

    public String getFalseAnswer2() {
        return falseAnswer2;
    }

    public void setFalseAnswer2(String falseAnswer2) {
        this.falseAnswer2 = falseAnswer2;
    }

    public String getFalseAnswer3() {
        return falseAnswer3;
    }

    public void setFalseAnswer3(String falseAnswer3) {
        this.falseAnswer3 = falseAnswer3;
    }

    public double getWeighting() {
        return weighting;
    }

    public void setWeighting(double weighting) {
        this.weighting = weighting;
    }
}
