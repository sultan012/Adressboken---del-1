import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Sultan on 2016-11-28.
 */
public class AddressBook implements Serializable {
    AddressBookManager addressBookManager = new AddressBookManager();
    ArrayList<Person> list = new ArrayList<>();



    public void addContact(String firstName, String lastName, String email) {
        list.add(new Person(UUID.randomUUID(), firstName, lastName, email));

    }


    public void search(ArrayList<Person> list, String searchWord) {
        ArrayList searchResult = new ArrayList();
        for (int i = 0; i < list.size(); i++) {

            if (searchWord.equalsIgnoreCase(list.get(i).getFirstName().substring(0, searchWord.length())) ||
                    searchWord.equalsIgnoreCase(list.get(i).getLastName().substring(0, searchWord.length()))) {
                searchResult.add(list.get(i));

            }
        }
        addressBookManager.showList(searchResult);
    }


}
