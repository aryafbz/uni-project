package uni.Package;

import base.Package.Person;

import java.util.HashMap;

public class Transcript {
    public int studentID;
    public HashMap<Integer, Double> transcript;

    public Transcript(int newStudentId) {
        studentID = newStudentId;
        transcript = new HashMap<>();
    }

    public void setGrade(int presentedCourseId, double grade) {
        for(int i = PresentedCourse.presentedCoursesList.size() - 1; i >= 0; i--) {
            if(PresentedCourse.presentedCoursesList.get(i).courseID == presentedCourseId)
            {
                for(int j = PresentedCourse.presentedCoursesList.get(i).studentIdList.size() - 1; j >= 0; j--) {
                    if(studentID == PresentedCourse.presentedCoursesList.get(i).studentIdList.get(j)){
                        transcript.put(presentedCourseId, grade);
                    }
                }
            }
        }
    }

    public void printTranscript() {
        for (int l = Student.studentList.size() - 1; l >= 0; l--) {
            if (Student.studentList.get(l).studentId == studentID) {
                System.out.println(Person.findById(Student.studentList.get(l).personId).name);
                System.out.println(Student.studentList.get(l).studentCode);


                for (int i = PresentedCourse.presentedCoursesList.size() - 1; i >= 0; i--) {
                    for (int j = PresentedCourse.presentedCoursesList.get(i).studentIdList.size() - 1; j >= 0; j--) {
                        if (studentID == PresentedCourse.presentedCoursesList.get(i).studentIdList.get(j)) {
                            for (int k = Course.courseList.size() - 1; k >= 0; k--) {
                                if (PresentedCourse.presentedCoursesList.get(i).courseID == Course.courseList.get(k).id) {
                                    System.out.println(Course.courseList.get(k).title + ":" + " " + transcript.get(PresentedCourse.presentedCoursesList.get(i).courseID));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public double getGPA() {
        double sum = 0.0;
        int units = 1;
        int count = 0;
        for (int i = PresentedCourse.presentedCoursesList.size() - 1; i >= 0; i--) {
            for (int j = PresentedCourse.presentedCoursesList.get(i).studentIdList.size() - 1; j >= 0; j--) {
                if (studentID == PresentedCourse.presentedCoursesList.get(i).studentIdList.get(j)) {
                    for(int k = Course.courseList.size() - 1; k >= 0; k--) {
                        if(Course.courseList.get(k).id == PresentedCourse.presentedCoursesList.get(i).courseID) {
                            units = Course.courseList.get(k).units;
                        }
                    }
                    sum += (transcript.get(PresentedCourse.presentedCoursesList.get(i).courseID) * units);
                    count = count + units;
                }
            }
        }
        return sum / count;
    }
}