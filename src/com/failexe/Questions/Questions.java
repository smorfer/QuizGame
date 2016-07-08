package com.failexe.Questions;
import com.failexe.List.Listelement;
import java.io.*;

public class Questions implements QuestionsInterface {

    private Listelement first;

    public Questions(Listelement first) {
        this.first = first;
    }

    public Listelement getFirst() {
        return first;
    }

    private static void readQuestions() throws  IOException {
        FileReader fr = new FileReader("Fragen.docx");
        BufferedReader br = new BufferedReader(fr);

        String q = br.readLine();
        String ta = br.readLine();
        String fa1 = br.readLine();
        String fa2 = br.readLine();
        String fa3 = br.readLine();
        double w = br.readLine();
        new Question(q,ta,fa1,fa2,fa3,w);
    }

    @Override

    public Question getQuestion() {
        return null;
    }
}
