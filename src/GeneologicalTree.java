import java.util.ArrayList;
import java.util.List;

public class GeneologicalTree {
    List<Human> humanList = new ArrayList<>();
    public void add(Human human){

        humanList.add(human);
    }
    public void showInfo(){
        for (Human human:humanList) {
            System.out.println(human);
        }
    }
}
