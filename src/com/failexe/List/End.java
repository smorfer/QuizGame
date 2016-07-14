package com.failexe.List;

import com.failexe.Questions.Question;

/**
 * Created by sebastian.rink on 08.07.2016.
 */
public class End extends Listelement {

   public End()
   {}


   public Listelement getNext()
   {return this;}

    public Content getContent()
    {return null;}

    public Node addBackwards(Content nodeContent)
    {return new Node(this, nodeContent);}

    public Content getLastContent(Content currentContent)
    {return currentContent;}

    public Listelement deleteNode()
    {return null;}

    public Listelement addNode()
    {return null;}

    public Node getNode()
    {return null;}

    public int getNodeQuantity()
    {return 0;}

    public void showData()
    {}

 @Override
 public void insert(Question q) {

 }
}

