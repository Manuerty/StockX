package edu.badpals.stockX.offer;

public class Ask implements Offer{
    private String size="";
    private Integer ask= 0;

    Ask(String size, Integer ask){
        this.ask = ask;
        this.size = size;
    }
    @Override
    public String size(){
        return this.size;
    }
    @Override
    public int value(){
        return this.ask;
    }

    @Override
    public int compareTo(Offer ask) {
        return this.ask.compareTo(ask.value());
    }

    @Override
    public String toString(){
        return  this.size() +  Integer.toString(this.value()) ;
    }
}
