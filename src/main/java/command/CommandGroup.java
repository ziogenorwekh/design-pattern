package command;

import java.util.ArrayList;
import java.util.List;

// 자신 이외에 어떤 명령이 있는지 모른다.
public class CommandGroup implements Command {

    private List<Command> commandList = new ArrayList<>();

    public void add(Command command) {
        commandList.add(command);
    }
    @Override
    public void run() {
        int cntCommand = commandList.size();
        for (int i = 0; i < cntCommand; i++) {
            Command command = commandList.get(i);
            command.run();
        }
    }
}
