
import java.util.Iterator;
import java.util.List;

public class AnimalIterator<E> implements Iterator<E> {

    private List<E> animals;
    private int index;

    public AnimalIterator(List<E> h) {
        this.animals = h;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return index < animals.size();
    }

    @Override
    public E next() {
        // TODO Auto-generated method stub
        return animals.get(index++);
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }
}
