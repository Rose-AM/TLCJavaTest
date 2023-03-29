package com.objectsAndClasses;

//Question 1
public class Trade {

    //attributes
    private String idOfTrade;
    private String symbolOfTrade;
    private int quantityOfTrade;
    private double priceOfTrade;

    //Default Constructor
    public Trade(){}

    //First Constructor
    public Trade(String id, String symbol, int quantity, double price) {
        this.idOfTrade = id;
        this.symbolOfTrade = symbol;
        this.quantityOfTrade = quantity;
        this.priceOfTrade = price;
    }

    //Second Constructor
    public Trade(String id, String symbol, int quantity){
        this.idOfTrade = id;
        this.symbolOfTrade = symbol;
        this.quantityOfTrade = quantity;
    }


    //Setter method for Trade price
    public void setPriceOfTrade(double value){
        if (value >= 1) this.priceOfTrade = value; // because price can only be positive values but prices are never 0
        else {
            System.out.println("Price must be greater than zero.");
        }
    }

    //Getter method for Trade price
    public double getPriceOfTrade(){
        return priceOfTrade;
    }

    //Getter method for Trade Quantity
    public double getQuantityOfTrade(){
        return quantityOfTrade;
    }

    //defining toString() method to allow object of Trade be printed to console
    @Override
    public String toString (){
        return ("objects of Trade are: Trade - " + idOfTrade + ", Symbol - " + symbolOfTrade + ", Quantity - " + quantityOfTrade + ", Price - " + priceOfTrade);
    }
}



