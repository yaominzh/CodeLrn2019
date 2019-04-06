package com.az.pattern.structual.adapter;

public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();
    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/44;
        System.out.println("use PowerAdapter input AC:" + adapterInput + "adapter to " + adapterOutput);

        return adapterOutput;
    }
}
