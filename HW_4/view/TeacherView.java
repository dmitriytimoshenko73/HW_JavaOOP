package HW_4.view;

import java.util.List;
import java.util.logging.Logger;

import HW_4.data.Teacher;

public class TeacherView implements UserView<Teacher> {
    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teacher) {
        for(Teacher user: teacher){
            logger.info(user.toString());
        }
    }
}