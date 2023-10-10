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
    private Human spouse;
    private List<Human> children;

    public Human(String name, Gender gender, LocalDate birthDay, LocalDate deathDay,
                 Human father, Human mather, Human spouse) {
        //this.id = id;
        this.name = name;
        this.gender = gender;
        BirthDay = birthDay;
        DeathDay = deathDay;
        this.father = father;
        this.mather = mather;
        this.spouse = spouse;
        children = new ArrayList<>();
    }

    public Human(String name, Gender gender, LocalDate birthDay, Human spouse) {
        this(name, gender, birthDay, null, null, null, spouse);
    }

    public Human(String name, Gender gender, LocalDate birthDay, Human father, Human mather) {
        this(name, gender, birthDay,null, father, mather, null);
    }

    public void setId(long id) {this.id = id;}

    public void setSpouse(Human spouse) {this.spouse = spouse;}

    StringBuilder sb = new StringBuilder();

    @Override
    public String toString() {
        sb.append("ID: " + id + ", ");
        sb.append("Имя: " + name + ", ");
        sb.append("Пол: " + gender + ", ");
        sb.append("Дата рождения: " + BirthDay + ", ");
        if(DeathDay == null){
            sb.append("Возраст: " + countAge(BirthDay) + ", ");
        }

        if(father != null){
            sb.append("Отец: " + father.name + ", ");
        }else{
            sb.append("Отец не известен. ");
        }
        if(mather != null){
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
        if(spouse != null){
            sb.append("Супруг(а): " + spouse.name);
        }else{
            sb.append("Супруг(а) не известен(на)");
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