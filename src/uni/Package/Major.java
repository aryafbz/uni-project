package uni.Package;

import java.util.ArrayList;

public class Major {
    public int majorId;
    public static ArrayList<Major> majorlist = new ArrayList<Major>();
    public String majorName;
    public final int Maxcapacity;
    public int numberOfStudents = 0;

    public Major(String newMajorName , int newMaxCapacity) {
        majorName = newMajorName;
        Maxcapacity = newMaxCapacity;
        majorlist.add(this);
        majorId = majorlist.size();
    }

    public static Major findById(int majorid){
        for(int i = majorlist.size() - 1 ; i>=0 ; i--)
        {
            if(majorlist.get(i).majorId == majorid)
                return majorlist.get(i);
        }
        return null;
    }

    public void addStudent(){
        numberOfStudents++;
        if(numberOfStudents > Maxcapacity){
            System.out.println("you can't add more students to the major");
        }
    }
}
