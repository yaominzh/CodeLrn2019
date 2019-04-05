package chap04factory;

public class SimplePizzaFactory {
    public Pizza createPiza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }
        else if ( type.equals("vegie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
