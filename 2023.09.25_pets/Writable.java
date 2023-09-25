import java.io.FileNotFoundException;
import java.io.IOException;

public interface Writable {
    void save() throws IOException;

    PetShop read() throws FileNotFoundException, IOException;

}
