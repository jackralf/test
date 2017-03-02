package Strategy;

/**
 * Created by machenfei on 2017/3/2.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior f) {
        flyBehavior = f;
    }

    public abstract void display();
}
