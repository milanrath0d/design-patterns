package creational.builder;

/**
 * @author Milan Rathod
 */
public class CoffeeBuilder extends BeverageBuilder {

    @Override
    public Beverage createBeverage() {
        return new Beverage();
    }

    @Override
    void setBeverageType() {
        System.out.println("Making Coffee");
        getBeverage().setBeverageName("Coffee");
    }

    @Override
    void setWater() {
        System.out.println("Adding Water");
        getBeverage().setWater(1);
    }

    @Override
    void setSugar() {
        System.out.println("Adding Sugar");
        getBeverage().setSugar(2);
    }

    @Override
    void setMilk() {
        System.out.println("Adding Milk");
        getBeverage().setMilk(3);
    }

}
