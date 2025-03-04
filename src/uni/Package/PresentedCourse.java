package uni.Package;

import java.util.ArrayList;

public class PresentedCourse {
    public int id;
    public static ArrayList<PresentedCourse> presentedCoursesList = new ArrayList<PresentedCourse>();
    public int courseID;
    public int professorID;
    public  int capacity;
    public ArrayList<Integer> studentIdList;

    public PresentedCourse(int newCourseID, int newProfessorID, int newCapacity)
    {
        courseID = newCourseID;
        professorID = newProfessorID;
        capacity = newCapacity;
        studentIdList = new ArrayList<Integer>();
        presentedCoursesList.add(this);
        id = presentedCoursesList.size();
    }

    public void addStudent(int studentID)
    {
        studentIdList.add(studentID);
        if(studentIdList.size() == capacity) {
            System.out.println("you can't add more students");
        }
    }

    public static PresentedCourse findById(int id)
    {
        for (int i = presentedCoursesList.size() - 1; i >= 0; i--)
        {
            if(id == presentedCoursesList.get(i).id)
            {
                return presentedCoursesList.get(i);
            }
        }
        return null;

    }

}
