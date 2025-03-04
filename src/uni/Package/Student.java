package uni.Package;
import uni.Package.Major;

import java.util.ArrayList;

public class Student {
    public int studentId;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public int personId;
    public int majorId;
    public final int entranceYear;
    public String studentCode;

    public Student(int newPersonId , int newEnteranceYear, int newMajorId) {
        personId = newPersonId;
        entranceYear = newEnteranceYear;
        majorId = newMajorId;
        studentList.add(this);
        studentId = studentList.size();
        setStudentCode();
    }


    public void setStudentCode(){
        String s = Integer.toString(entranceYear);
        String s2 = s.substring(1,s.length());
        if(s2.charAt(0) == '3')
            s2 = s.substring(2 , s.length());
        for(int i = 0 ; i < Major.majorlist.size() ; i++){
            if(majorId == Major.majorlist.get(i).majorId){
                Major.majorlist.get(i).addStudent();
                if(Major.majorlist.get(i).numberOfStudents <= Major.majorlist.get(i).Maxcapacity){
                    if(Major.majorlist.get(i).numberOfStudents < 10) {
                        studentCode = s2 + Integer.toString(majorId) + "0" +  Integer.toString(Major.majorlist.get(i).numberOfStudents);
                    }
                    if(Major.majorlist.get(i).majorId < 10)
                    {
                        studentCode = s2 + "0" + Integer.toString(majorId) +  Integer.toString(Major.majorlist.get(i).numberOfStudents);
                    }
                    if(Major.majorlist.get(i).majorId < 10 && Major.majorlist.get(i).numberOfStudents < 10)
                        studentCode = s2 + "0" + Integer.toString(majorId) + "0" +  Integer.toString(Major.majorlist.get(i).numberOfStudents);
                }

            }
        }
    }

    public static Student findById(int id)
    {
        for(int i = studentList.size() - 1 ; i >= 0 ; i--)
        {
            if(studentList.get(i).studentId == id)
                return studentList.get(i);
        }
        return null;
    }
}
