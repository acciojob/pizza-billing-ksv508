package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        setExtraCheese(80);
        if(isVeg)
            setExtraTopping(70);
        else
            setExtraTopping(120);
    }
}
