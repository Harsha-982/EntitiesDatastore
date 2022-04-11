import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Interns in=new Interns();
        ArrayList<Interns> interns=new ArrayList();
        interns.add(new Interns(43,"harsha"));
        interns.add(new Interns(32,"usha"));

        Collections.sort(interns);

        for(Interns interns1:interns){
            System.out.println(interns1);
        }
    }
}
