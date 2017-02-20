import java.util.ArrayList;

/**
 * Created by machenfei on 2017/2/20.
 */
public class DotCom {
    ArrayList<String> locationCells;
    String name;

    public void setLocationCells(ArrayList<String> cells) {
        locationCells = cells;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String check(String userGuess) {
        String result = "miss";
        if (locationCells.contains(userGuess)) {
            result = "hit";
            locationCells.remove(userGuess);

            if (locationCells.isEmpty()) {
                result = "kill";
            }
        }

        return result;
    }
}
