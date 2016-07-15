package com.failexe.Highscore;

/**
 * Created by schueler05.0019 on 08.07.2016.
 */

public class Score {
    private int score;
    private HighScore highScore;

    public Score (HighScore highScore) {
        score=0;
        this.highScore = highScore;
    }

    public void increaseScore(){
        score ++;
    }

    public void decreaseScore(){
        if(score > 0){
            score--;
        }
    }

    public void resetScore(){
        score=0;
    }

    public int getScore(int score){
        return score;
    }

    public void setScore(int score){
        this.score =score;
    }
}
