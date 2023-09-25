public class AddAnimal extends Command {

    public AddAnimal(Console console) {
        super(console);

    }

    @Override
    public String description() {
        return "Add new animal";
    }

    @Override
    public void execute() {
        getConsole().addAnimal();
      

    }

}
