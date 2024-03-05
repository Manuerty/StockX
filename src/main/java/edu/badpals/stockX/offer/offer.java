package edu.badpals.stockX.offer;

public interface offer extends Comparable<offer>{

    public String size();
    public int value();
    public int compareTo(offer offer);
}
