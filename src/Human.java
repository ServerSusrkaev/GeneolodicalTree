import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;


public class Human {
    private long id = 0;
    private String name;
    private Gender gender;
    private LocalDate BirthDay;
    private LocalDate DeathDay;
    private Human father;
    private Human mather;
    private List<Human> parents;
    private List<Human> children;

    public Human(long id, String name, Gender gender, LocalDate birthDay, LocalDate deathDay,
                 Human father, Human mather) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        BirthDay = birthDay;
        DeathDay = deathDay;
        this.father = father;
        this.mather = mather;

        parents = new ArrayList<>();
        children = new ArrayList<>();
    }

    public Human(long id, String name, Gender gender, LocalDate birthDay) {
        this(id, name, gender, birthDay, null, null, null);
    }

    public Human(long id, String name, Gender gender, LocalDate birthDay, Human father, Human mather) {
        this(id, name, gender, birthDay,null, father, mather);
    }

    StringBuilder sb = new StringBuilder();
    @Override
    public String toString() {
        id ++;
        sb.append("ID: " + id + ", ");
        sb.append("Имя: " + name + ", ");
        sb.append("Пол: " + gender + ", ");
        sb.append("Дата рождения: " + BirthDay + ", ");
        if(DeathDay == null){
            sb.append("Возраст: " + countAge(BirthDay) + ", ");
        }

        parents = new ArrayList<>();
        if(father != null){
            parents.add(father);
            sb.append("Отец: " + father.name + ", ");
        }else{
            sb.append("Отец не известен. ");
        }
        if(mather != null){
            parents.add(mather);
            sb.append("Мать: " + mather.name + ", ");
        }else {
            sb.append("Мать не известна. ");
        }

        if(children.size() != 0){
            sb.append("Дети: ");
            for (Human child:children) {
                sb.append(child.name + ", ");
            }
        }else{
            sb.append("Дети не известны. ");
        }

        return sb.toString();
    }






    public int countAge(LocalDate BirthDay){
        return Period.between(BirthDay, LocalDate.now()).getYears();
    }

    public void addChild(Human human){
        children.add(human);
    }
}
