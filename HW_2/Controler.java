package HW_2;

import java.util.List;

public class Controler {
    private StreamServes streamServes;

    public Controler() {
        streamServes = new StreamServes();
    }

    public void sortedStreams(List<Stream> streams) {
        streamServes.sortedStreams(streams);
    }
}

