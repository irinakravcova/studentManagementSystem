package studentManagementSystem;

import javax.swing.*;
import java.util.ArrayList;

public class School {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Teacher>teachers = new ArrayList<>();
    ArrayList<Course>courses = new ArrayList<>();
    ArrayList<Exam>exams = new ArrayList<>();

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.exams = new ArrayList<>();
    }
    public School(ArrayList<Student> students, ArrayList<Course> courses, ArrayList<Exam> exams) {
        this.students = students;
        this.courses = courses;
        this.exams = exams;
    }
    public School(ArrayList<Teacher> teachers, ArrayList<Course> courses) {
        this.teachers = teachers;
        this.courses = courses;
    }

    public String addStudent(){
        String name = JOptionPane.showInputDialog("Enter Student name:  ");
        Student student = new Student(name);
        this.students.add(student);
        return student.getName() + " was added successfully.";
    }
    public String addTeacher(){
        String name = JOptionPane.showInputDialog("Enter Teacher name:  ");
        Teacher teacher = new Teacher(name);
        this.teachers.add(teacher);
        return teacher.getNameTeacher() + " was added successfully.";
    }
    public String addCourse(){
        String title = JOptionPane.showInputDialog("Enter course title:  ");
        Teacher teacherName = (Teacher) JOptionPane.showInputDialog(null,"choose teacher from the list",
                "Add teacher to course", JOptionPane.QUESTION_MESSAGE, null,
                this.teachers.toArray(), this.teachers.toArray()[0]);
        Course course = new Course(title, teacherName.getNameTeacher());
        this.courses.add(course);
        return course.getTitleCourse() + " was added successfully.";
    }
    public String addExam(){
        int resultExam = Integer.parseInt(JOptionPane.showInputDialog("Enter exam result:  "));
        Exam exam = new Exam(resultExam);
        this.exams.add(exam);
        return exam.getExamResult() + " was added successfully.";
    }
}
