import java.io.FileNotFoundException;
import java.io.IOException;

public class Presenter {
    private View view;
    private Service service;
    private String answer;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);

    }

    public void openFile() {
        try {
            answer = service.read().getAnimalList().toString();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        view.print(answer);
    }

    public void saveFile() {

        try {
            service.save();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public void showPetShop() {
        answer = service.getInfo().toString();
        view.print(answer);
    }

    public void getByName(String name) {

        answer = service.getByName(name).toString();
        view.print(answer);

    }

    public void setNewCommandByName(String name, String command) {

        answer = service.setNewCommand(name,command).toString();
        view.print(answer);

    }
    public void addAnimal(String name,int year, String animal,String type, String command) {
        answer = service.addAnimal(name, year, animal, type, command).toString();
        view.print(answer);
        

    }


}
