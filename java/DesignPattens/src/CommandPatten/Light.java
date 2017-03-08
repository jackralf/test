package CommandPatten;

/**
 * Created by machenfei on 2017/3/8.
 */
public class Light {
    private String name = "";

    public Light(String name) {
        this.name = name;
    }

    void on() {
        System.out.println(name + ":light on");
    }

    void off() {
        System.out.println(name + ":light off");
    }
}
