package com.failexe.Questions;

/**
 * Created by sebastian.rink on 15.07.2016.
 */
public class Answer {

    private String answer;
    private boolean rightAnswer;

    public Answer(String answer, boolean right) {
        this.answer = answer;
        this.rightAnswer = right;
    }

    public String getAnswer(){
        return  answer;
    }

    boolean check(){
        return  rightAnswer;
    }
}
