package com.failexe.Questions;
import com.failexe.List.Listelement;

public class Questions implements QuestionsInterface {

    private Listelement first;

    public Questions(Listelement first) {
        this.first = first;
    }

    public Listelement getFirst() {
        return first;
    }


    @Override

    public Question getQuestion() {
        return null;
    }
}
