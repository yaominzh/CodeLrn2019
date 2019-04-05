package chap04factory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStypeCheesePizza();
        }else if (type.equals("veggie")){
            return new VeggiePizza();
        }else return null;
    }
}
