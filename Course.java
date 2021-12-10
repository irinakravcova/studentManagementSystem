package studentManagementSystem;

public class Course extends Teacher{
    public String titleCourse;



    public Course(String titleCourse, String name) {
        super(name);
        this.titleCourse = titleCourse;
    }

    public String getTitleCourse() {
        return titleCourse;
    }
}
