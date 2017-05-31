package com.zz.thinking.adapter.adapter;

import com.zz.thinking.adapter.Duck;
import com.zz.thinking.adapter.turkey.Turkey;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        turkey.gobble();
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 6; i++) {
            turkey.fly();
        }
    }

}