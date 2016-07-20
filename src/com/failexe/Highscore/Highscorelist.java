package com.failexe.Highscore;

/**
 * Created by schueler05.0019 on 08.07.2016.
 */


import java.util.ArrayList;
import java.util.Collections;

public class Highscorelist {
    private final ArrayList <Integer> scoreList;

    public Highscorelist (){
        scoreList=new ArrayList();
    }


    public void putScore(int score){
        scoreList.add(score);
        Collections.sort(scoreList);
    }
    public int[] getHighestScores(int quantity){
        if (quantity > scoreList.size ()){
            quantity = scoreList.size ();
        }
        int[] highScores = new int [quantity];
        for (int i=0;i < quantity; i++){
            highScores[i] = scoreList.get(i);
        }
        return highScores;
    }
}
