import java.util.ArrayList;
import java.util.List;

public class GeneologicalTree {
    int id = 1;
    List<Human> humanList = new ArrayList<>();

    public void add(Human human){
        humanList.add(human);
        human.setId(id++);
    }
    public void showInfo(){
        for (Human human:humanList) {
            System.out.println(human);
        }
    }
}
