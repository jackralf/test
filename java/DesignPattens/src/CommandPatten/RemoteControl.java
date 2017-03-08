package CommandPatten;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by machenfei on 2017/3/8.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> undoCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        undoCommands = new Stack<Command>();

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i ++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommands.push(onCommands[slot]);
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommands.push(offCommands[slot]);
    }

    public void undoButtonWasPressed() {
        if (!undoCommands.isEmpty()) {
            Command command = undoCommands.pop();
            command.undo();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- RemoteControl ---\n");
        for (int i = 0; i < 7; i ++) {
            sb.append("[slot " + i + "]"
                    + onCommands[i].getClass().getSimpleName()
                    + "\t\t" + offCommands[i].getClass().getSimpleName()
                    + "\n");
        }
        sb.append(undoCommands.toString());

        return sb.toString();
    }
}
