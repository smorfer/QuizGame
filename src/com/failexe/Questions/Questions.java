package com.failexe.Questions;
import com.failexe.List.Content;
import com.failexe.List.List;
import com.failexe.List.Listelement;
import java.io.File;

public class Questions implements QuestionsInterface {

    private List list;
    private File file;

    public Questions(List list, File file) {
        this.list = list;
        this.file = file;

    }

    private void insert(Content q){
        list.getFirst().addNode(q);
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
