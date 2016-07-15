package com.failexe.Questions;
import com.failexe.List.List;
import java.io.File;

public class Questions implements QuestionsInterface {

    private List[] lists = new List[10];
    private File[] files = new File[10];

    public Questions(File file) {

        for(int i = 0; i < 10; i++){
            this.files[i] = new File("//files//Questions" + i + ".txt");
        }

        for(int i = 0; i< 10; i++){
            this.lists[i] = getQuestions(i);
        }

    }


    private List getQuestions(int weighting){
        List newList = new List();
        fileReader fr = new fileReader(files[weighting]);

        while (!fr.finish()) {
            newList.addLast(fr.readQuestion());
        }
        fr.finish();
    }



    @Override

    public Question getQuestion(int weighting) {
        return = lists[weighting].getRandom();
    }

    public boolean check(Answer answer){
        return answer.check();
    }
}
