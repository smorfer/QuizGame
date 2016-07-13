package com.failexe.List;

/**
 * Created by sebastian.rink on 08.07.2016.
 */
public class Listelement {
    public abstract Listelement getNext();
    public abstract Content getContent();
    public abstract Node getNode();
    public abstract Node addNode();
    public abstract Listelement deleteNode();
    public abstract int getNodeQuantity();
    public abstract void showData();
}
