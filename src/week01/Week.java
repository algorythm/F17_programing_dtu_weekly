package week01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by awo on 30/01/17.
 */
public class Week {
    public static void run() {
        LinkedStack<String> s = new LinkedStack<>();
        s.push("test01");
        s.push("test02");
        s.push("test03");
        s.push("test04");
        s.push("test05");
        s.show();
    }
}
