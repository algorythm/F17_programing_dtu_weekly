package main;

import java.util.LinkedList;

/**
 * Created by awo on 30/01/17.
 */
public class Main {
    public static void main(String[] args) {
        int weekNo = 0;
        try {
            weekNo = Integer.parseInt(args[0]);
        } catch(Exception e) {}

        switch(weekNo) {
            case 1:
                week01.Main wk01 = new week01.Main();
                break;
            case 2:
                week02.Main wk02 = new week02.Main();
                break;
            default:
                break;
        }
    }
}
