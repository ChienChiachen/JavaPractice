package tw.designpattern.creational.builder;

/**
 * Created by chiachen on 2016/11/24.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
