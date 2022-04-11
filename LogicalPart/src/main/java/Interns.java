

public class Interns implements Comparable<Interns>{
    private int age;
    private String name;

    public Interns(){}
    public Interns(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Interns{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }



    @Override
    public int compareTo(Interns o) {
        if(age>o.age){
            return -1;
        }
        else if(age<o.age){
            return 1;
        }
        else{
            return 0;
        }
    }

}
