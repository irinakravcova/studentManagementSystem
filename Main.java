import studentManagementSystem.*;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        School school = new School();
        JOptionPane.showMessageDialog(null, school.addTeacher());
        JOptionPane.showMessageDialog(null, school.addCourse());
        }
    }

