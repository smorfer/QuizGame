package com.failexe.List;

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

    public Listelement getRandom()
    {
        return first.getRandom();
    }
}
