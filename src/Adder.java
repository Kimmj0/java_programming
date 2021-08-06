import java.util.Scanner;

public class Adder {
    public static void main(String[] args){
        // 두 정수를 입력받아 더해서 출력해주는 프로그램 by.명지
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("두개의 숫자를 입력하세요.");
        String numberInput1 = scanner.next();
        String numberInput2 = scanner.next();
        int number1 = Integer.parseInt(numberInput1);
        int number2 = Integer.parseInt(numberInput2);
        System.out.println("두 수의 합은 " + (number1 + number2) + "입니다.");
        */

        System.out.println("첫번째 숫자를 입력하세요.");
        String numberInput1 = scanner.nextLine();
        System.out.println("두번째 숫자를 입력하세요.");
        String numberInput2 = scanner.nextLine();
        try{
            int number1 = Integer.parseInt(numberInput1);
            int number2 = Integer.parseInt(numberInput2);
            int sum = number1 + number2;
            System.out.println("두 수의 합은 " + sum + "입니다.");
        }catch (Exception e){
            System.out.println("숫자를 변환하는 동안 오류가 발생했습니다.");
        }
    }
}
