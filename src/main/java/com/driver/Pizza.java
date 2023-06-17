package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese;
    private int extraTopping;
    private int paperPrice;
    private int total;

    public int getPaperPrice() {
        return paperPrice;
    }

    public void setPaperPrice(int paperPrice) {
        this.paperPrice = paperPrice;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(int extraCheese) {
        this.extraCheese = extraCheese;
    }

    public int getExtraTopping() {
        return extraTopping;
    }

    public void setExtraTopping(int extraTopping) {
        this.extraTopping = extraTopping;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        setBill("");
        setExtraCheese(0);
        setExtraTopping(0);
        setTotal(0);
        setPrice(0);
    }

    public int getPrice(){
        if(isVeg) setPrice(300);
        else setPrice(400);
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        setExtraCheese(80);
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
            setExtraTopping(70);
        else
            setExtraTopping(120);
    }

    public void addTakeaway(){
        // your code goes here
        setPaperPrice(20);
    }

    public String getBill(){
        // your code goes here
        total = getPrice() + getExtraCheese() + getExtraTopping() + getPaperPrice();
        boolean extraCheese = false, extraTopping = false, paperPrice = false;
        if(getExtraCheese() != 0) extraCheese = true;
        if(getExtraTopping() != 0) extraTopping = true;
        if(getPaperPrice()!= 0) paperPrice = true;
        bill += "Base Price Of The Pizza: " + getPrice() + "\n";
        if(extraCheese) bill += "Extra Cheese Added: " + getExtraCheese() + "\n";
        if(extraTopping) bill += "Extra Toppings Added: " + getExtraTopping() + "\n";
        if(paperPrice) bill += "Paperbag Added: " + getPaperPrice() + "\n";
        bill += "Total Price: " + getTotal() + "\n";
        return this.bill;
    }
}
