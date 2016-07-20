package com.failexe.Questions;
import com.failexe.List.List;
import java.io.File;
import java.lang.String;

public class Questions implements QuestionsInterface {

    private List[] lists = new List[10];
    private File[] files = new File[10];

    public Questions() {

        //Not working
        /*for(int i = 1; i < 10; i++){
            this.files[i] = new File("files/Questions" + String.valueOf(1) + ".txt");
        }*/
        this.files[0] = new File("D:\\Projects\\Java\\Java 8\\QuizGame\\src\\com\\failexe\\Questions\\files\\Questions1.txt");
        this.files[1] = new File("D:\\Projects\\Java\\Java 8\\QuizGame\\src\\com\\failexe\\Questions\\files\\Questions2.txt");
        this.files[2] = new File("D:\\Projects\\Java\\Java 8\\QuizGame\\src\\com\\failexe\\Questions\\files\\Questions3.txt");
        this.files[3] = new File("D:\\Projects\\Java\\Java 8\\QuizGame\\src\\com\\failexe\\Questions\\files\\Questions4.txt");
        this.files[4] = new File("D:\\Projects\\Java\\Java 8\\QuizGame\\src\\com\\failexe\\Questions\\files\\Questions5.txt");
        this.files[5] = new File("D:\\Projects\\Java\\Java 8\\QuizGame\\src\\com\\failexe\\Questions\\files\\Questions6.txt");
        this.files[6] = new File("D:\\Projects\\Java\\Java 8\\QuizGame\\src\\com\\failexe\\Questions\\files\\Questions7.txt");
        this.files[7] = new File("D:\\Projects\\Java\\Java 8\\QuizGame\\src\\com\\failexe\\Questions\\files\\Questions8.txt");
        this.files[8] = new File("D:\\Projects\\Java\\Java 8\\QuizGame\\src\\com\\failexe\\Questions\\files\\Questions9.txt");
        this.files[9] = new File("D:\\Projects\\Java\\Java 8\\QuizGame\\src\\com\\failexe\\Questions\\files\\Questions10.txt");

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
