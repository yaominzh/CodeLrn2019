package com.az.pattern.structual.decorator;

public class BattercakeWithEgg  extends Battercake{
    @Override
    public String setDesc() {
        return super.getClass() + "add an egg";
    }

    @Override
    public int cost() {
        return super.cost();
    }

}
