package tw.designpattern.creational.simplefactory2;

/**
 * Created by chiachen on 2016/11/6.
 */
public class Square implements Shape {
    protected Square() {
    }

    @Override
    public void draw() {
        System.out.println("it's Square");
    }
}
