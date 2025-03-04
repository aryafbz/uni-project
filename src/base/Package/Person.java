package base.Package;

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

    public static Person findById(int id) {
        for (int i = personList.size() - 1; i >= 0; i--)
        {
            if(personList.get(i).id == id)
                return personList.get(i);
        }
        return null;
    }

}
