package HW_5.controller;

package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Group;
import model.Student;
import model.Teacher;
import model.Type;
import model.User;
import service.DataService;
import service.GroupService;
import view.GroupView;
import view.StudentView;
import view.TeacherView;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final GroupView groupView = new GroupView();
    private final GroupService groupService = new GroupService();

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер группы");
        number = scanner.nextInt();
        return number;

    }

    public User getGroupTeacher() { // назначить преподавателя группы
        int id;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID педагога");
        id = scanner.nextInt();

        // scanner.close();
        return dataService.getUserById(Type.TEACHER, id);

    }

    public List<User> studentsInGroup() { // подбираем студентов в группу

        List<User> studentsGroup = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID студентов, закончите - введите 0");

        while (true) {

            int number = scanner.nextInt();

            studentsGroup.add(dataService.getUserById(Type.STUDENT, number));

            if (number == 0) {

                break;
            }

        }

        return studentsGroup;

    }


    public void createGroup() {
        

        int numberGroup = getGroupNumber();
        User teacherGroup = getGroupTeacher();
        List<User> students = studentsInGroup();
        Group group = groupService.createGroup(numberGroup, teacherGroup, students);
        groupView.printOnConsole(group);

    }

}
