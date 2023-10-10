import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GeneologicalTree tree = new GeneologicalTree();

        //Родители
        Human mansur = new Human("Мансур", Gender.Мужской, LocalDate.of(1953, 7, 25), null, null, null, null);
        Human milana = new Human( "Милана", Gender.Женский, LocalDate.of(1983, 2, 17), null);

        mansur.setSpouse(milana);
        milana.setSpouse(mansur);

        tree.add(mansur);
        tree.add(milana);

        //Дети
        Human shamil = new Human("Шамиль", Gender.Мужской, LocalDate.of(1993, 8, 12), mansur, milana);
        Human larisa = new Human("Лариса", Gender.Женский, LocalDate.of(1999, 4, 21), mansur, milana);
        Human ruslan = new Human("Руслан", Gender.Мужской, LocalDate.of(2004, 2, 19), mansur, milana);

        tree.add(shamil);
        tree.add(larisa);
        tree.add(ruslan);

        //Добавение детей родителям
        mansur.addChild(shamil);
        mansur.addChild(larisa);
        mansur.addChild(ruslan);
        milana.addChild(shamil);
        milana.addChild(larisa);
        milana.addChild(ruslan);

        //Добавление сестер и братьев
        shamil.addBroSis(larisa);
        shamil.addBroSis(ruslan);
        larisa.addBroSis(shamil);
        larisa.addBroSis(ruslan);
        ruslan.addBroSis(shamil);
        ruslan.addBroSis(larisa);

//        mansur.addBroSis();
//        milana.addBroSis();

        tree.showInfo();
    }
}