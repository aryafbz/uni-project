package uni.packages;

import java.util.ArrayList;

public class Major {
    public int majorId;
    public static ArrayList<Major> majorlist = new ArrayList<Major>();
    public String majorName;
    public final int Maxcapacity;
    int numberOfStudents = 0;

    public Major(String newMajorName , int newMaxCapacity) {
        majorName = newMajorName;
        Maxcapacity = newMaxCapacity;
        majorlist.add(this);
        majorId = majorlist.size();
    }

    public static void findByld(int majorid){
        
    }
}
