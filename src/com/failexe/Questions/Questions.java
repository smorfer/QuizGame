package com.failexe.Questions;
import com.failexe.List.List;
import com.failexe.List.Listelement;
import java.io.File;

public class Questions implements QuestionsInterface {

    private List list;
    private File file;

    public Questions(Listelement first, File file) {
        this.list = list;
        this.file = file;

    }

    public Listelement getFirst() {
        return list.getFirst();
    }

    private void insert(Question q){
        list.getFirst().insert(q);
    }

    public void getQuestions(){
        fileReader fr = new fileReader(file);

        while (!fr.finish()) {
            this.insert(fr.readQuestion());
        }
        fr.finish();
    }



    @Override

    public Question getQuestion() {
        return null;
    }
}
