package com.zz.java.thinking.behavior.template.hotdrink;


public class MainTest {
    public static void main(String[] args) {

        HotDrink mCoffee = new Coffee();
        TeaWithHook mTeaWithHook = new TeaWithHook();
        //mCoffee.prepareRecipe();
        mTeaWithHook.prepareRecipe();
    }
}
