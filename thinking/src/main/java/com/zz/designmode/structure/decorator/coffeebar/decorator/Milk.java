package com.zz.designmode.structure.decorator.coffeebar.decorator;

import com.zz.designmode.structure.decorator.coffeebar.Drink;

public class Milk extends Decorator {

    public Milk(Drink Obj) {
        super(Obj);
        // TODO Auto-generated constructor stub
        super.setDescription("Milk");
        super.setPrice(2.0f);
    }

}
