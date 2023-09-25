
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private Console console;
    private List<Option> commands;

    public Menu(Console console) {
        this.console = console;
        commands = new ArrayList();

        commands.add(new OpenFile(console));
        commands.add(new ShowPetShop(console));
        commands.add(new AddAnimal(console));
        commands.add(new SetNewCommand(console));
        commands.add(new SaveFile(console));
        commands.add(new Exit(console));

    }

    void execute(int num) {
        Option option = commands.get(num - 1);
        option.execute();
    }

    public String printMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(": ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");

        }
        return stringBuilder.toString();
    }
}