package com.az.pattern.structual.decorator;

public class BattercakeWithEggSausage extends BattercakeWithEgg{
    @Override
    public String setDesc() {
        return super.setDesc()+"and a sausage";
    }

    @Override
    public int cost() {
        return super.cost();
    }
}
