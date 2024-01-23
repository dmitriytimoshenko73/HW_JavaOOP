package HW_2;
import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        int numberGroups1 = stream1.studyGroups.size();
        int numberGroups2 = stream2.studyGroups.size();

        return Integer.compare(numberGroups1, numberGroups2);
    }
}
    

