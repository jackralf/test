package Strategy;

/**
 * Created by machenfei on 2017/3/2.
 */
public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with rocket");
    }
}
