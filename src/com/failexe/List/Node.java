package com.failexe.List;

/**
 * Created by sebastian.rink on 08.07.2016.
 */
public class Node {
    private Listelement next;
    private Content content;

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

    public Node addNode() {
        return null;
    }

    public Listelement deleteNode() {
        return null;
    }

    public int getNodeQuantity()
    {return 1+next.getNodeQuantity();}

    public void showData()
    {}
}
