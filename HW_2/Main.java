// Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable.
// Создать класс StreamComparator, реализующий сравнение количества групп входящих в Поток.
// Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный 
// StreamComparator.
// Модифицировать класс Контроллер, добавив в него созданный сервис.
// Модифицировать класс Контроллер, добавив в него метод сортирующий список потоков, путем вызова 
// созданного сервиса. 
package HW_2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stream stream1 = new Stream();
        stream1.addStudyGroup(new StudyGroup("Группа 1"));
        stream1.addStudyGroup(new StudyGroup("Группа 2"));

        Stream stream2 = new Stream();
        stream2.addStudyGroup(new StudyGroup("Группа 3"));

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        Controler controler = new Controler();
        controler.sortedStreams(streams);

        for (Stream stream : streams) {
            System.out.println("Количество групп: " + stream.studyGroups.size());
            for (StudyGroup group : stream) {
                System.out.println(group.name);
            }
            System.out.println();
        }
    }
}