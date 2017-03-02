package Strategy;

/**
 * Created by machenfei on 2017/3/2.
 */
public class RedheadDuck extends Duck {

    RedheadDuck() {
        flyBehavior = new FlyWithRocket();
    }

    @Override
    public void display() {
        System.out.println("red head duck");
    }
}
