package com.failexe.Questions;
import com.failexe.List.List;
import java.io.File;
import java.lang.String;

public class Questions implements QuestionsInterface {

    private List[] lists = new List[10];
    private File[] files = new File[10];

    public Questions() {

        /*for(int i = 1; i < 10; i++){
            this.files[i] = new File("files/Questions" + String.valueOf(1) + ".txt");
        }

        for(int i = 0; i< 10; i++){
            this.lists[i] = getQuestions(i);
        }*/
        this.files[0] = new File("files/Questions1.txt");

    }


    private List getQuestions(int weighting){
        List newList = new List();
        fileReader fr = new fileReader(files[weighting]);

        while (!fr.finish()) {
            newList.addLast(fr.readQuestion());
        }
        fr.finish();

        return newList;
    }



    @Override

    public Question getQuestion(int weighting) {
        return (Question) lists[weighting].getRandom();
    }

    @Override
    public boolean check(Answer answer){
        return answer.check();
    }
}
