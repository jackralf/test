package Strategy;

/**
 * Created by machenfei on 2017/3/2.
 */
public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.display();

        Duck readhead = new RedheadDuck();
        readhead.performFly();
        readhead.display();

        readhead.setFlyBehavior(new FlyWithWing());
        readhead.performFly();
    }
}
