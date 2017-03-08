package CommandPatten;

/**
 * Created by machenfei on 2017/3/8.
 */
public class SimpleRemoteControl {
    Command command;
    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }

    public void undoButtonWasPressed() {
        command.undo();
    }
}
