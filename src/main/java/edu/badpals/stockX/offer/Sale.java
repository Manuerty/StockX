package edu.badpals.stockX.offer;

public class Sale implements Offer{
        private String size="";
        private Integer price=0;

        Sale (String size, Integer price){
                this.size = size;
                this.price = price;
        }
        @Override
        public String size(){
                return this.size;
        }
        @Override
        public int value(){
                return this.price;
        }
        @Override
        public int compareTo(Offer price){
                return this.price.compareTo(price.value());
        }
        @Override
        public String toString(){
                return this.size() + Integer.toString(this.value());
        }
}
