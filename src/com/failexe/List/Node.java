package com.failexe.List;

import com.failexe.Questions.Question;

/**
 * Created by sebastian.rink on 08.07.2016.
 */
public class Node extends Listelement{
    private Listelement next;
    public Content content;

    public Node(Listelement n, Content c)
    {
        next = n;
        content = c;
    }

    public void setNext(Listelement n)
    {next=n;}

    public void setContent(Content c)
    {content = c;}

    public Listelement getNext()
    {return next;}

    public Content getContent()
    {return content;}



    public Listelement deleteNode() {
        return null;
    }

    public int getNodeQuantity()
    {return 1+next.getNodeQuantity();}

    @Override
    public Node getNode() {
        return this;
    }

    @Override
    public Listelement addNode(Content newContent){
        next = next.addNode(newContent);
        return this;
    }

    @Override
    public void showData() {

    }

    @Override
    public void insert(Question q) {

    }

    public Listelement getRandom()
    {
       return content.getContent();
    }
}
