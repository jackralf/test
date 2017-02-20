import java.util.ArrayList;

/**
 * Created by machenfei on 2017/2/20.
 */
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int tryTime = 0;

    public void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("Jack.com");
        DotCom three = new DotCom();
        three.setName("Tom.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        for (DotCom dotCom : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotCom.setLocationCells(newLocation);
        }
    }

    public void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }

        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        tryTime ++;
        String result = "miss";
        for (DotCom dotCom : dotComsList) {
            result = dotCom.check(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotCom);
                result += " " + dotCom.getName();
                break;
            }
        }

        System.out.println(result);
    }

    private void finishGame() {
        if (tryTime > 10) {
            System.out.println("> 10");
        } else {
            System.out.println("<= 10 good!!!");
        }
    }
}
