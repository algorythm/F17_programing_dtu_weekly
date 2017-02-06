package week01;

import main.Week;

import java.util.ArrayList;

/**
 * Created by awo on 30/01/17.
 */
public class Main implements Week {
    public Main() {
        run();
    }

    @Override
    public void run() {
        LinkedStack<String> s = new LinkedStack<>();
        s.push("test01");
        s.push("test02");
        s.push("test03");
        s.push("test04");
        s.push("test05");
        s.show();
        ArrayList<String> test;
    }
}
