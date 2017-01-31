package week01;

/**
 * Created by awo on 30/01/17.
 */
public class Week {
    public static void run() {
//        Stack s = new ArrayStack(5);
//
//        System.out.println("Empty: " + s.empty());
//        System.out.println("Full: " + s.full());
//
//        s.push("Dette");
//        s.push("er");
//
//        System.out.println("Empty: " + s.empty());
//        System.out.println("Full: " + s.full());
//
//        s.push("en");
//        s.push("hel");
//        s.push("stack");
//
//        System.out.println("Empty: " + s.empty());
//        System.out.println("Full: " + s.full());
//
//        System.out.println();
//
//        s.show();


        Stack<String> s = new ArrayStack<>(2);
        s.push("Hej");
        s.push("Verden");
        s.show();
    }
}
