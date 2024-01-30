package HW_4.view;

import java.util.List;

import HW_4.data.Person;

public interface UserView<T extends Person> {
    void sendOnConsole(List<T> list);
}