
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        PetShop<Animal> tree = new PetShop();


        View view = new Console();
        Service service = new Service(tree);
        Presenter presenter = new Presenter(view, service);
        view.start();

        

    }

}
