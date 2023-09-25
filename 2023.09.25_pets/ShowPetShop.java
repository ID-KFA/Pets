public class ShowPetShop extends Command {

    public ShowPetShop(Console console) {
        super(console);

    }

    @Override
    public String description() {
        return "Show Pet Shop";
    }

    @Override
    public void execute() {
        getConsole().showPetShop();

    }

}
