package CommandPatten;

/**
 * Created by machenfei on 2017/3/8.
 */
public class Test {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light kitchenLight = new Light("kitchen");
        Light livingRoomLight = new Light("Living Room");

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        remoteControl.setCommand(0, kitchenLightOn, kitchenLightOff);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);

        remoteControl.undoButtonWasPressed();
        remoteControl.undoButtonWasPressed();
        remoteControl.undoButtonWasPressed();

        MacroCommand macroCommand = new MacroCommand(new Command[]{kitchenLightOn, livingRoomLightOff});
        remoteControl.setCommand(2, macroCommand, new NoCommand());
        remoteControl.onButtonWasPressed(2);
        remoteControl.undoButtonWasPressed();

    }
}
