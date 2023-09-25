import java.util.List;
import java.util.Scanner;

public class Console implements View {
    private Scanner scanner;
    private Menu menu;
    private boolean work;
    private Presenter presenter;
    private String name, animal, type, command, str;
    private int year;

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        scanner = new Scanner(System.in);
        menu = new Menu(this);
        work = true;
        while (work) {
            hello();
            String command = scanner.nextLine();
            if (checkInput(command)) {
                menu.execute(Integer.parseInt(command));
            } else {
                System.out.println("Something goes wrong");
            }
        }
    }

    private boolean checkInput(String text) {
        return text.matches("[1-6]+");
    }

    private void hello() {
        System.out.println(menu.printMenu());
    }

    @Override
    public void print(String result) {
        System.out.println(result);

    }

    public void finish() {
        work = false;
    }

    public void openFile() {
        presenter.openFile();
    }

    public void saveFile() {
        presenter.saveFile();
    }

    public void showPetShop() {
        presenter.showPetShop();

    }

    public void getByName() {
        System.out.println("Input name");
        presenter.getByName(scanner.nextLine());
    }

    public void addAnimal() {
        name=null;
        animal=null;
        type=null;
        command=null;
        year=0;
        str =null;
      

        
        System.out.println("Input name");
        name = scanner.nextLine();
        if (!name.matches("[^\\d\\s]+") ){
            System.out.println("Wrong name");
            start();
                }
       
       
     

        System.out.println("Input year");
        str = scanner.nextLine();
        if (!str.matches("^\\d+$"))
        {
            System.out.println("Wrong year");
              start();
                }

        else {
            year = Integer.parseInt(str);
        }

        

        
        System.out.println("Input animal (cat, dog, etc)");
        animal = scanner.nextLine();
          if (!animal.matches("[^\\d\\s]+") ){
            System.out.println("Wrong animal");
            start();
        }


        System.out.println("Input type (pet, pack)");
        type = scanner.nextLine();
        if (!type.matches("[^\\d\\s]+") ){
            System.out.println("Wrong type");
            start();
        }

        System.out.println("Input command");
        command = scanner.nextLine();
       if (!command.matches("[^\\d\\s]+") ){
            System.out.println("Wrong command");
            start();
        }
        

        presenter.addAnimal(name, year, animal, type, command);
        Counter.add();
        System.out.println("Added animals: " + Counter.getCount());


    }

    public void setNewCommand() {

        System.out.println("Input name");
        name = scanner.nextLine();

        System.out.println("Input command");
        command = scanner.nextLine();

        presenter.setNewCommandByName(name, command);
    }

}
