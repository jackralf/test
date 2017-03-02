package Strategy;

/**
 * Created by machenfei on 2017/3/2.
 */
public class MallardDuck extends Duck {

    MallardDuck() {
        flyBehavior = new FlyWithWing();
    }

    @Override
    public void display() {
        System.out.println("mallard duck");
    }
}
