package tw.designpattern.creational.simplefactory2;

/**
 * Created by chiachen on 2016/11/6.
 */
public class Rectangle implements Shape {
    protected Rectangle() {
    }

    @Override
    public void draw() {
        System.out.println("it's a Rectangle");
    }
}
