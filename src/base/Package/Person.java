package uni.packages;

import java.util.ArrayList;

public class Person {
    public int id;
    public static ArrayList<Person> personList = new ArrayList<>();
    public String name;
    public final String NATIONALID;

    public Person(String newName, String newNationalID) {
        name = newName;
        NATIONALID = newNationalID;
        personList.add(this);
        id = personList.size();
    }

    public static void findByld(int id) {
        for (int i = personList.size(); i >= 0; i--) {
            if (i == id) {
                System.out.println("name: " + personList.get(i - 1).name);
                System.out.println("nationalId: " + personList.get(i - 1).NATIONALID);
            }
        }
    }

}
