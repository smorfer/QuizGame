package com.failexe.List;

/**
 * Created by sebastian.rink on 08.07.2016.
 */
public class End extends Listelement {

   public End getNext()
   {return this;}

    public Content getContent()
    {return null;}

    public Node addBackwards(Content nodeContent)
    {return new Node(this, currentContent);}

    public Content getLastContent(Content currentContent)
    {return currentContent;}

    public Listelement deleteNode()
    {}

    public Listelement addNode()
    {}

    public Node getNode()
    {}

    public int getNodeQuantity()
    {return 0;}

    public void showData()
    {}
}

