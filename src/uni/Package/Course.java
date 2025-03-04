package uni.Package;

import java.util.ArrayList;

public class Course {
    public int id;
    public static ArrayList<Course> courseList = new ArrayList<Course>();
    public String title;
    public int units;

    public Course (String newTitle, int newUnits) {
        title = newTitle;
        units = newUnits;
        courseList.add(this);
        id = courseList.size();
    }
    public static Course findById(int id)
    {
        for(int i = courseList.size() - 1; i >= 0; i--)
        {
            if(courseList.get(i).id == id)
                return courseList.get(i);
        }
        return null;
    }
}
