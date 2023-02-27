package command;

public class MainEntry {
    public static void main(String[] args) {

        CommandGroup cmdGroup = new CommandGroup();

        Command clearCmd = new ClearCommand();
        cmdGroup.add(clearCmd);

        Command yellowColorCmd = new ColorCommand(ColorCommand.Color.YELLOW);
        cmdGroup.add(yellowColorCmd);


        Command mvCmd = new MoveCommand(10, 1);
        cmdGroup.add(mvCmd);

        Command printCmd = new PrintCommand("안녕하세요! 디자인 패턴!");
        cmdGroup.add(printCmd);

        Command moveCmd2 = new MoveCommand(15, 5);
        cmdGroup.add(moveCmd2);
        cmdGroup.add(printCmd);

        Command moveCmd3 = new MoveCommand(25, 8);
        cmdGroup.add(moveCmd3);

        Command greenCmd = new ColorCommand(ColorCommand.Color.GREEN);
        cmdGroup.add(greenCmd);
        cmdGroup.add(printCmd);

        cmdGroup.run();
    }
}
