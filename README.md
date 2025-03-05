University Management System

این پروژه یک سیستم مدیریت دانشگاه است که شامل اطلاعات دانشجویان، اساتید، دوره‌ها، و گزارش‌های آموزشی است. این سیستم به شما امکان می‌دهد که اطلاعات مختلفی را از جمله دانشجویان، اساتید، رشته‌های تحصیلی، و دوره‌های درسی ثبت و مدیریت کنید.

ویژگی‌ها
مدیریت افراد: شامل اطلاعات دانشجویان و اساتید.
مدیریت رشته‌های تحصیلی: هر دانشجو می‌تواند یک رشته تحصیلی انتخاب کند.
دوره‌های درسی: امکان ایجاد دوره‌های درسی و افزودن دانشجویان به آن‌ها.
گزارش‌های تحصیلی: امکان ثبت نمرات و محاسبه معدل (GPA) برای هر دانشجو.
ساختار پروژه
کلاس‌ها
Person: شامل اطلاعات عمومی افراد (نام و شماره ملی).
Major: شامل اطلاعات رشته‌های تحصیلی و تعداد دانشجویان در هر رشته.
Course: شامل اطلاعات دوره‌های درسی (عنوان و واحدها).
PresentedCourse: ارتباط بین اساتید و دوره‌های درسی و مدیریت دانشجویان در هر دوره.
Student: شامل اطلاعات مربوط به دانشجویان، رشته تحصیلی، سال ورود، و کد دانشجویی.
Professor: شامل اطلاعات مربوط به اساتید و رشته تحصیلی که آن‌ها تدریس می‌کنند.
Transcript: گزارش تحصیلی دانشجویان که نمرات و معدل (GPA) را محاسبه می‌کند.
نحوه استفاده
ابتدا اشیاء مختلف مانند Major، Course، Student و Professor ایجاد کنید.
دانشجویان را به دوره‌های مختلف اضافه کنید.
نمرات دانشجویان را در هر دوره ثبت کنید.
برای مشاهده گزارش تحصیلی و محاسبه معدل هر دانشجو از متدهای موجود استفاده کنید.
مثال استفاده
java
Copy
public class Main {
    public static void main(String[] args) {
        Major math = new Major("Math", 10);
        Major chemistry = new Major("Chemistry", 10);

        Person ali = new Person("Ali", "1");
        Person arya = new Person("Arya", "2");

        Student Ali = new Student(ali.id, 1398, math.majorId);
        Student Arya = new Student(arya.id, 1398, math.majorId);

        Professor Nora = new Professor(ali.id, math.majorId);

        Course math1 = new Course("Math1", 3);

        PresentedCourse Math1 = new PresentedCourse(math1.id, Nora.id, 10);
        Math1.addStudent(Ali.studentId);
        Math1.addStudent(Arya.studentId);

        Transcript ALI = new Transcript(Ali.studentId);
        ALI.setGrade(Math1.courseID, 14);

        ALI.printTranscript();
    }
}
توابع موجود

findById(int id): جستجو برای یک شخص، دانشجو، استاد یا دوره بر اساس ID.

addStudent(int studentID): افزودن دانشجو به یک دوره درسی.

setGrade(int courseID, double grade): تنظیم نمرات برای دانشجو در یک دوره.

printTranscript(): چاپ گزارش تحصیلی برای یک دانشجو.

getGPA(): محاسبه معدل (GPA) برای یک دانشجو.
