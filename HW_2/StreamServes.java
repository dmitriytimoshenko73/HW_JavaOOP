package HW_2;
import java.util.Collections;
import java.util.List;

public class StreamServes {
    public void sortedStreams(List<Stream> streams) {
        StreamComparator comparator = new StreamComparator();
        Collections.sort(streams, comparator);
    }
}
