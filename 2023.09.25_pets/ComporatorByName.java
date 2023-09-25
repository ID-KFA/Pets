import java.util.Comparator;

public class ComporatorByName<E extends Animal> implements Comparator<E> {

    @Override
    public int compare(E o1, E o2) {
        // TODO Auto-generated method stub
        return o1.getName().compareTo(o2.getName());
    }
}
