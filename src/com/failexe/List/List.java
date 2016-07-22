package com.failexe.List;

import java.util.Random;

/**
 * Created by Michi on 14.07.2016.
 */
public class List {
    private Listelement first = new End();

    //Methods

    public Listelement getFirst()
    {return first;}

    public void addLast(Content newContent)
    {first = first.addNode(newContent);}

    public Content getLastContent()
    {Content content = first.getContent();
    content = first.getNext().getContent();
    return content;}

    public void deleteNode()
    {

    }
    public int getNodeQuantity(){
        return first.getNodeQuantity();
    }

    public Content getRandom()
    {
        Random ran = new Random();
        return first.getRandom(ran.nextInt(getNodeQuantity()));
    }
}
