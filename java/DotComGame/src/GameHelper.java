import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by machenfei on 2017/2/20.
 */
public class GameHelper {
    private int[] mainLocation = new int[49];
    private static final String alphabet = "abcdefg";

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        return inputLine;
    }

    public ArrayList<String> placeDotCom(int count) {
        ArrayList<String> location = new ArrayList<String>();
        int tryTime = 0;
        while (tryTime < 200) {
            tryTime ++;
            int direction = (int)(Math.random() * 2);
            if (direction == 0) {
                //水平
                int line = (int)(Math.random() * 7);
                int row = (int)(Math.random() * (7 - count + 1));
                int postion = 7 * line + row;
                if (mainLocation[postion] == 0 && mainLocation[postion + 1] == 0 && mainLocation[postion + 2] == 0) {
                    location.add(String.valueOf(alphabet.charAt(line)) + (row + 1));
                    location.add(String.valueOf(alphabet.charAt(line)) + (row + 2));
                    location.add(String.valueOf(alphabet.charAt(line)) + (row + 3));
                    mainLocation[postion] = 1;
                    mainLocation[postion + 1] = 1;
                    mainLocation[postion + 2] = 1;
                    break;
                }
            }
            else {
                //垂直
                int row = (int)(Math.random() * 7);
                int line = (int)(Math.random() * (7 - count + 1));
                int postion = 7 * line + row;
                if (mainLocation[postion] == 0 && mainLocation[postion + 7] == 0 && mainLocation[postion + 14] == 0) {
                    location.add(String.valueOf(alphabet.charAt(line)) + (row + 1));
                    location.add(String.valueOf(alphabet.charAt(line + 1)) + (row + 1));
                    location.add(String.valueOf(alphabet.charAt(line + 2)) + (row + 1));
                    mainLocation[postion] = 1;
                    mainLocation[postion + 7] = 1;
                    mainLocation[postion + 14] = 1;
                    break;
                }
            }
        }

        System.out.println(location);
        return location;
    }
}
