
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.*;

public class PetShop<E extends Animal> implements Serializable, Iterable<E> {

    private List<E> animals;

    @Override
    public Iterator<E> iterator() {

        return new AnimalIterator<E>(animals);
    }

    public PetShop() {
        this(new ArrayList<E>());

    }

    private PetShop(List<E> animals) {
        this.animals = animals;
    }

    public void add(E h) {
        animals.add(h);

    }

    public List<E> getAnimalList() {
        return animals;
    }
}

    // public List<E> getKids(String name) {

    //     List<E> kids = new ArrayList<E>();
    //     for (int i = 0; i < humans.size(); i++) {

    //         if (this.humans.get(i).dadOf() != null) {

    //             if (this.humans.get(i).dadOf().getName().equals(name)) {

    //                 kids.add(this.humans.get(i));
    //             }

    //         }

    //         if (this.humans.get(i).momOf() != null) {

    //             if (this.humans.get(i).momOf().getName().equals(name)) {

    //                 kids.add(this.humans.get(i));
    //             }

    //         }

    //     }
    //     return kids;
    
    // }

    

