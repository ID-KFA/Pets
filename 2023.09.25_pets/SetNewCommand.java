public class SetNewCommand extends Command {

    public SetNewCommand(Console console) {
        super(console);

    }

    @Override
    public String description() {
        return "Set new command";
    }

    @Override
    public void execute() {
        getConsole().setNewCommand();

    }

}