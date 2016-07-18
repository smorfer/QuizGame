package com.failexe.List;

import com.failexe.Questions.Question;

/**
 * Created by sebastian.rink on 08.07.2016.
 */
public abstract class Listelement {
    public abstract Listelement getNext();
    public abstract Content getContent();
    public abstract Node getNode();
    public abstract Listelement addNode(Content newContent);
    public abstract Listelement deleteNode();
    public abstract int getNodeQuantity();
    public abstract void showData();
    public abstract void insert(Question q);
    public abstract Listelement getRandom();
}
