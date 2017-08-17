import java.io.*;
import java.util.ArrayList;

/**
 * Created by Sultan on 2016-11-28.
 */
public class FileInOut implements Serializable {

    public void saveToFile(ArrayList<Person> list) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("addressBook.ser"))) {
            out.writeObject(list);

        } catch (IOException e) {
            System.out.println("Something wrong occurred when reading data from file");
        }
    }


        public ArrayList<Person> loadFromFile (){

            ArrayList<Person> list = null;
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("addressBook.ser"))) {

                list = (ArrayList<Person>) in.readObject();
            } catch (IOException e) {
                System.out.println("Something wrong occurred when reading data from file");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return list;
        }

    }

