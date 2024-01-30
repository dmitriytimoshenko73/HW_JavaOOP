package HW_4.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import HW_4.data.Numerator;
import HW_4.data.Student;

public class StudentService implements UserService<Student> {

    private final List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Numerator<Student> numerator = new Numerator<>(students);
        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, numerator.getUniqueId());
        students.add(student);
    }
}