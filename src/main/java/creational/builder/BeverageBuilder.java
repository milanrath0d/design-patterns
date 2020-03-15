package creational.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Milan Rathod
 */
@Getter
@Setter
public abstract class BeverageBuilder {

    private Beverage beverage;

    public final Beverage buildBeverage() {
        Beverage beverage = createBeverage();
        setBeverage(beverage);
        setBeverageType();
        setWater();
        setMilk();
        setSugar();
        return beverage;
    }

    public abstract Beverage createBeverage();

    abstract void setBeverageType();

    abstract void setWater();

    abstract void setSugar();

    abstract void setMilk();
}
