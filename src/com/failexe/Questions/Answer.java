package com.failexe.Questions;

/**
 * Created by sebas on 15.07.2016.
 */
class Answer {

    private String answer;
    private boolean rightAnswer;

    public Answer(String answer, boolean right) {
        this.answer = answer;
        this.rightAnswer = right;
    }

    String getAnswer(){
        return  answer;
    }

    boolean check(){
        return  rightAnswer;
    }
}
