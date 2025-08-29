package conditional;

import java.util.*;

public class switchPractice {

    public static void main(String[] args) {
        int a = 10;
        switch (a) {
            case 1:
                System.out.println("open");
                break;
            case 2:
                System.out.println("half open");

                break;
            case 3:
                System.out.println("close");
                break;

            default:
                System.out.println("no button pressed");
        }
    }

}
