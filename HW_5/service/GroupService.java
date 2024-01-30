package HW_5.service;

import java.util.List;

import HW_5.model.Group;

public class GroupService  {

    

    public Group createGroup (int number, HW_5.model.User teacher, List<HW_5.model.User> students) {


        return new HW_5.model.Group(number,teacher,students);

               
    }
   
    
}