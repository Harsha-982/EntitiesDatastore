import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;

interface bool{
    boolean test(int i);
}
public class lambda {
    public static void main(String[] args) {
       bool b =(i)->i%2==0;
        ArrayList<Integer> a =new ArrayList<>();
        a.addAll(Arrays.asList(1,2,4));
        Collections.addAll(a,1,2,4,3);
       System.out.println(b.test(10));//->true
        Predicate<Integer> p=(i)->i%2==0;//(returns only boolean)
        System.out.println(p.test(11));//->false

        Function<Integer ,Boolean> f=(i)->i%2==0;//(can return any type)
        System.out.println(f.apply(10));//->true
        Function <Integer,Integer> f1=(i)->i*i;
        System.out.println(f1.apply(2));//4

    }
}
