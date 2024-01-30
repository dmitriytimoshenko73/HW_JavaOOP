package HW_5.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import HW_5.model.Group;
import HW_5.model.Student;
import HW_5.model.Teacher;
import HW_5.model.Type;
import HW_5.model.User;


public class Controller {
    private final HW_5.service.DataService dataService = new HW_5.service.DataService();
    private final HW_5.view.StudentView studentView = new HW_5.view.StudentView();
    private final HW_5.view.TeacherView teacherView = new HW_5.view.TeacherView();
    // private final HW_5.view.GroupView groupView = new HW_5.view.GroupView();
    private final HW_5.service.GroupService groupService = new HW_5.service.GroupService();

// import HW_5.model.Group;
// import HW_5.model.Student;
// import HW_5.model.Teacher;
// import HW_5.model.Type;
// import HW_5.model.User;

// public class Controller {
//     private final HW_5.service.DataService dataService = new HW_5.service.DataService();
//     private final HW_5.view.StudentView studentView = new HW_5.view.StudentView();
//     private final HW_5.view.TeacherView teacherView = new HW_5.view.TeacherView();
//     private final HW_5.service.GroupService groupService = new HW_5.service.GroupService();

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent() {
        for (User user : dataService.getAllConcUser(Type.STUDENT)) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName, String lastNameS) {
        dataService.create(firstName, secondName, lastNameS, Type.TEACHER); // создаем преподавателя
    }

    public void getAllTeacher() {
        for (User user : dataService.getAllConcUser(Type.TEACHER)) {
            teacherView.printOnConsole((Teacher) user);
        }
    }

    public Integer getGroupNumber() {// присвоить номер группе
        int number;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите номер группы");
            number = scanner.nextInt();
        }
        return number;

    }

    public User getGroupTeacher() { // назначить преподавателя группы
        int id;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите ID педагога");
            id = scanner.nextInt();
        }
        // scanner.close();
        return dataService.getUserById(Type.TEACHER, id);

    }

    public List<User> studentsInGroup() { // подбираем студентов в группу

        List<User> studentsGroup = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите ID студентов, закончите - введите 0");

            while (true) {

                int number = scanner.nextInt();

                studentsGroup.add(dataService.getUserById(Type.STUDENT, number));

                if (number == 0) {

                    break;
                }

            }
        }
        return studentsGroup;

    }


    public void createGroup() {
        

        int numberGroup = getGroupNumber();
        User teacherGroup = getGroupTeacher();
        List<User> students = studentsInGroup();
        HW_5.model.Group group = groupService.createGroup(numberGroup, teacherGroup, students);
        Group.printOnConsole(group);

    }

}
