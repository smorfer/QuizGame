package com.failexe.Questions;

/**
 * Created by Sebastian.Rink on 13.07.2016.
 */

import java.util.*;
import java.io.*;

class fileReader{

    Scanner s;

    fileReader(File f){


        try{
            s = new Scanner(f);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    Question readQuestion(){
        String q;
        String ta;
        String fa1;
        String fa2;
        String fa3;
        String wString;
        double w;

        q = this.read();
        ta = this.read();
        fa1 = this.read();
        fa2 = this.read();
        fa3 = this.read();
        wString = this.read();

        if(wString == null) {
            w = 0;
        } else {
            w = Double.parseDouble(wString);
        }

        return new Question(q,ta,fa1,fa2,fa3,w);
    }

    boolean finish(){
        return !s.hasNext();

    }


    private String read(){

        String temporaryString;

        if(s.hasNext()){

            temporaryString = s.nextLine();

            return temporaryString;

        }else {
            return null;
        }
    }



    void close(){
        s.close();
    }

}
