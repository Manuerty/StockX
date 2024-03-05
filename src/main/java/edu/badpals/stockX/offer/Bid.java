package edu.badpals.stockX.offer;

public class Bid implements Offer{

        private String size="";
        private Integer bid=0;

        Bid(String size, Integer bid){
                this.size= size;
                this.bid = bid;
        }
        public String size(){
                return  this.size;
        }
        public int value(){
                return  this.bid;
        }
        public int compareTo(Offer bid){
                return this.bid.compareTo(bid.value());
        }
        public String toString(){
                return this.size() + Integer.toString(this.value());
        }
}
