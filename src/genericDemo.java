import java.util.*;

public class genericDemo {
    void func() {
        List< Integer >ls = new ArrayList<Integer>();
        ls.add(25);
        ls.add(21);
        ls.add(26);
        ls.add(22);

        System.out.println(ls);
        System.out.println("\n\n-----------\n\n");

        Collections.sort(ls);
        System.out.println(ls);
    }
    public static void main(String[] args) {
        genericDemo obj = new genericDemo();
        obj.func();
    }
}
