import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GeneologicalTree tree = new GeneologicalTree();
        //Родители
        Human mansur = new Human(1, "Мансур", Gender.Мужской, LocalDate.of(1953, 7, 25));
        Human milana = new Human(2, "Милана", Gender.Женский, LocalDate.of(1983, 2, 17));

        tree.add(mansur);
        tree.add(milana);


        //Дети
        Human shamil = new Human(3, "Шамиль", Gender.Мужской, LocalDate.of(1993, 8, 12), mansur, milana);
        Human larisa = new Human(4, "Лариса", Gender.Женский, LocalDate.of(1999, 4, 21), mansur, milana);

        tree.add(shamil);
        tree.add(larisa);

        //System.out.println(shamil.getName());

        mansur.addChild(shamil);
        mansur.addChild(larisa);
        milana.addChild(shamil);
        milana.addChild(larisa);

        tree.showInfo();


    }
}
