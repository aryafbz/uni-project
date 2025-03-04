import base.Package.Person;
import uni.Package.*;

public class Main {
    public static void main(String[] args) {
        Major math = new Major("math" , 10);
        Major chemistry = new Major("Chemistery" , 10);

        Person ali = new Person("ali" , "1");
        Person arya = new Person("arya" , "2");
        Person nora = new Person("nora" , "3");
        Person afshin = new Person("afshin" , "4");
        Person parsa = new Person("parsa" , "5");

        Student Ali = new Student(ali.id , 1398 , math.majorId);
        Student Arya = new Student(arya.id , 1399 , math.majorId);
        Student Parsa = new Student(parsa.id , 1400 , chemistry.majorId);

        System.out.println(ali.name + " " + Ali.studentCode);
        System.out.println(arya.name + " " + Arya.studentCode);
        System.out.println(parsa.name + " " + Parsa.studentCode);

        Professor Nora = new Professor(nora.id, math.majorId);
        Professor Afshin = new Professor(afshin.id , chemistry.majorId);

        System.out.println(nora.name + " " + Nora.id);
        System.out.println(afshin.name + " " + Afshin.id);

        Course math1 = new Course("math1" ,3);
        Course math2 = new Course("math2" , 2);
        Course chemistry1 = new Course("chemistry1" , 1);

        PresentedCourse Math1 = new PresentedCourse(math1.id , Nora.id, 10);
        PresentedCourse Math2 = new PresentedCourse(math2.id , Nora.id, 10);
        PresentedCourse Chemistry1 = new PresentedCourse(chemistry1.id , Afshin.id, 10);

        Math1.addStudent(Ali.studentId);
        Math1.addStudent(Arya.studentId);
        Math2.addStudent(Ali.studentId);
        Math2.addStudent(Arya.studentId);
        Math2.addStudent(Parsa.studentId);
        Chemistry1.addStudent(Parsa.studentId);

        Transcript ALI = new Transcript(Ali.studentId);
        Transcript ARYA = new Transcript(Arya.studentId);
        Transcript PARSA = new Transcript(Parsa.studentId);

        ALI.setGrade(Math1.courseID, 14);
        ALI.setGrade(Math2.courseID, 18);
        ARYA.setGrade(Math1.courseID, 19);
        ARYA.setGrade(Math2.courseID, 20);
        PARSA.setGrade(Math2.courseID, 15);
        PARSA.setGrade(Chemistry1.courseID, 17);

        ALI.printTranscript();
        ARYA.printTranscript();
        PARSA.printTranscript();

        System.out.println("ALI's GPA :" + ALI.getGPA());
        System.out.println("Arya's GPA :" + ARYA.getGPA());
        System.out.println("Parsa's GPA :" + PARSA.getGPA());


    }
}