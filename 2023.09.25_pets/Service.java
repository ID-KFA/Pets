import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class Service<E extends Animal> implements Writable {
    private PetShop<E> shop;

    private Animal result;

    public Service(PetShop<E> shop) {
        this.shop = shop;
    }

    public void sortByName() {
        Collections.sort(shop.getAnimalList(), new ComporatorByName());

    }

    public void sortByYear() {
        Collections.sort(shop.getAnimalList(), new ComporatorByYear());
    }

    public List<E> getInfo() {
        List res = new ArrayList();
        String str;
        for (int i = 0; i < shop.getAnimalList().size(); i++) {
            str = shop.getAnimalList().get(i).toString();
            res.add(str);
        }
        return res;
    }

    public Animal getByName(String name) {
        result = null;
        for (int i = 0; i < shop.getAnimalList().size(); i++) {
            if (this.shop.getAnimalList().get(i).getName().equals(name))
                result = this.shop.getAnimalList().get(i);

        }
        return result;

    }

     public List setNewCommand(String name, String command) {
        result = null;
        for (int i = 0; i < shop.getAnimalList().size(); i++) {
            if (this.shop.getAnimalList().get(i).getName().equals(name)){
                Animal h = this.shop.getAnimalList().get(i);
                h.setCommand(command);
               
            
            }
                

        }
        return shop.getAnimalList();

    }

    public List addAnimal(String name, int year, String animal, String type, String command) {

        Animal h = new Animal(name,year, animal,type,command);
        shop.add((E) h);
       

        return shop.getAnimalList();
    }

    @Override
    public PetShop<E> read() throws FileNotFoundException, IOException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Petshop.out"));

        try {
            shop = (PetShop<E>) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("File opened");
        objectInputStream.close();
        return this.shop;

    }

    @Override
    public void save() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Petshop.out"));
        objectOutputStream.writeObject(shop);

        objectOutputStream.close();
        System.out.println("File saved");

    }
}
