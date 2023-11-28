package solution;

import java.util.Scanner;

public class UserInput {
    //Scanner
    Scanner scanner = new Scanner(System.in);
    //String 받아오기
    public String getString(){
        String input = scanner.nextLine();
        return input;
    }
    //Int 받아오기
    public int getInt(){
        int input = scanner.nextInt();
        return input;
    }
    //Exit 여부 판단하기
    public boolean getExitKey(){
        System.out.println("exit : 0 / continue : 1");
        int bool = scanner.nextInt();
        //버퍼에 남은 값 제거 
        scanner.nextLine();
        if(bool == 1) return true;
        else return false;
    }
}
