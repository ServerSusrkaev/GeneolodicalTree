import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneologicalTree {
    long id = 1;
    List<Human> humanList = new ArrayList<>();

    public void add(Human human){
        humanList.add(human);
        human.setId(id++);
    }

    public void showInfo() throws IOException {
        FileHandling fileHandling = new FileHandling();
//        for (Human human:humanList) {
//            System.out.println(human);
//        }
        fileHandling.writeToFile(humanList);
        fileHandling.readFromFile();
    }
}
