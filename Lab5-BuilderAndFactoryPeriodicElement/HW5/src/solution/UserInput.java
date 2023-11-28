package solution;

import java.util.Scanner;

public class UserInput {
    public static String getString(){
        //scanner를 통한 phase(String) input
        Scanner sc = new Scanner(System.in);
        System.out.print("phase 값을 입력하시오 : ");
        return sc.nextLine();
    }
}
