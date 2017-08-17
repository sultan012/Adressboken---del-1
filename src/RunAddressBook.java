import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by Sultan on 2016-11-28.
 */
public class RunAddressBook {
    public  void run() throws IOException, ClassNotFoundException {
        AddressBook addressbook = new AddressBook();
        AddressBookManager addressBookManager = new AddressBookManager();
        FileInOut fileInOut = new FileInOut();
        Scanner sc = new Scanner(System.in);

        String order;
        addressbook.list = fileInOut.loadFromFile();
        if (addressbook.list == null) {
           addressbook.list = new ArrayList<>();
        }

        System.out.println("******( Welcome! ) ******");

        while (true) {
            String[] inputData = sc.nextLine().trim().split("\\s+");
            order = inputData[0];
            switch (order) {
                case "add":
                    addressbook.addContact( inputData[1], inputData[2], inputData[3]);
                    break;
                case "list":
                   addressBookManager.showList(addressbook.list);
                    break;
                case "search":
                    addressbook.search(addressbook.list, inputData[1]);
                    break;
                case "quit":
                   addressBookManager.exit(addressbook.list);
                    break;
            }

        }

    }



}
