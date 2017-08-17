import java.util.ArrayList;

/**
 * Created by Sultan on 2016-11-28.
 */
public class AddressBookManager {

    public void showList(ArrayList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\n----------------------------------------" +
                    "\nId: " + list.get(i).getId() +
                    "\nFirst Name: " + list.get(i).getFirstName() +
                    "\nLast Name: " + list.get(i).getLastName() +
                    "\nE.mail address : " + list.get(i).getEmail() +
                    "\n----------------------------------------");

        }
    }

    public void exit(ArrayList<Person> list)  {

        FileInOut fileInOut= new FileInOut();
        fileInOut.saveToFile(list);
        System.out.println("\n****** ( Good Bye! ) ******");
        System.exit(0);
    }


}
