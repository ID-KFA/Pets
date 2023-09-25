
import java.util.List;
import java.io.*;

public class Animal implements Serializable {
    private String name;
    private String type;
    private String animal;
    private String command;
    
    
    List<String> commands;
    private int year;

    public Animal(String name,int year, String animal, String type, String command) {
        this.name = name;
        this.type = type;
        this.year = year;
        this.animal=animal;
        this.command=command;
       
    }




    public String getName() {
        return name;

    }

    public String getType() {
        return type;

    }
    public String getAnimals() {
        return animal;

    }


    public int getYear() {
        return year;
    }

    public String getCommand(){
    return command;
    }
    
    public void setCommand(String command){
    this.command = command;
    }
    

    @Override
    public String toString() {

        String str;

        str = "\n"+getName() +" "+ getYear() +" "+getType()+" "+ getAnimals()+" "+getCommand();
    

        return str;
    }

}
