package com.failexe.Questions;
import com.failexe.List.Content;
import com.failexe.List.List;
import com.failexe.List.Listelement;
import java.io.File;

public class Questions implements QuestionsInterface {

    private List[] list[];
    private File[] file[];

    public Questions(File file) {
        list[] = new List[10];
        file[] = new File[10];

        for(int i = 0; i < 10; i++){
            this.file[i] = /*source*/Questions[i];
        }

        for(int i = 0; i< 10; i++){
            this.list[i] = getQuestions(i);
        }
        this.file = file;
        this.getQuestions();

    }


    public void getQuestions(int weighting){
        fileReader fr = new fileReader(file[weighting]);

        while (!fr.finish()) {
            this.insert(fr.readQuestion());
        }
        fr.finish();
    }



    @Override

    public Question getQuestion(double weighting) {

    }
}
