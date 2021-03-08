package tarefa02.question02;

public class People {
    String name;
    int age;

    public People ( String name, int age ){
        this.name = name;
        this.age = age;
    }
    public void setName( String name ){
        this.name = name;
    }
    public void setAge( int age ){
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
