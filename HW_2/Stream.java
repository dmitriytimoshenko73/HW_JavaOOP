package HW_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> studyGroups;{
    }    
    public Stream() {
      studyGroups = new ArrayList<>(); 
    }
    
    public void addStudyGroup(StudyGroup group) {
            
        studyGroups.add(group);
        }
    
        @Override
        public Iterator<StudyGroup> iterator() {
            return studyGroups.iterator();
        }
     
    }

