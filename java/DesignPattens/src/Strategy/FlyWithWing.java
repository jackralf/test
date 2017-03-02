package Strategy;

/**
 * Created by machenfei on 2017/3/2.
 */
public class FlyWithWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with wing");
    }
}
