package super_keyWord;

public class Hero extends Person{
    String power;
    Hero(String name,int age, String power){
        super(name,age);

        this.power = power;
    }

    public String toString(){
        return name + "\n" +age+"\n"+power;
    }
}
