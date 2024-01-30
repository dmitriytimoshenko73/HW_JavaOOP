package HW_4.controller;

import java.time.LocalDate;

import HW_4.data.Person;

public interface UserController<T extends Person> {
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}