package chap04factory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();
    void prepare(){
        System.out.println("Prepareing " + name);
        System.out.println("Tossing dough..");
        System.out.println("Adding souce ...");
        System.out.println("Adding toppings...");
        for ( int i=0 ; i< toppings.size(); i++){
            System.out.println("   " + toppings.get(i));
        }
    }
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut(){
        System.out.println("cutting the pizza in official PizzaStore box");
    }
    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

}
