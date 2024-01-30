package HW_5.model;


import java.util.List;

public class Group {

    private int numberGroup;
    private User teacherGroup;
    private List<User> students;

    public Group(int numberGroup, User teacherGroup, List<User> students) {
        this.teacherGroup = teacherGroup;
        this.students = students;
        this.numberGroup = numberGroup;
    }

    public User getTeacherGroup() {
        return teacherGroup;
    }

    public void setTeacherGroup(Teacher teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    @Override
    public String toString() {
        return "Группа № "+ numberGroup +
                 teacherGroup +
                ", students:" + students +
                '}';
    }

    public static void printOnConsole(Group group) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printOnConsole'");
    }
}    

