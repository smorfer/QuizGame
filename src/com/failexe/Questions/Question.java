package com.failexe.Questions;

import com.failexe.List.Content;

/**
 * Created by sebastian.rink on 06.07.2016.
 */

public class Question extends Content {

    private String question;
    private Answer trueAnswer;
    private Answer falseAnswer1;
    private Answer falseAnswer2;
    private Answer falseAnswer3;

     Question (String q, String ta, String fa1, String fa2, String fa3, int w){
        question = q;
        trueAnswer = new Answer(ta,true);
        falseAnswer1 = new Answer(fa1,false);
        falseAnswer2 = new Answer(fa2,false);
        falseAnswer3 = new Answer(fa3,false);
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

    public Answer getTrueAnswer() {
        return trueAnswer;
    }

    public Answer getFalseAnswer1() {
        return falseAnswer1;
    }

    public Answer getFalseAnswer2() {
        return falseAnswer2;
    }

    public Answer getFalseAnswer3() {
        return falseAnswer3;
    }

    public boolean check(Answer answer){
        return answer.check();
    }

    @Override

    public Content getContent(){
        return this;
    }


}
