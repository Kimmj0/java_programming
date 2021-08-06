import java.util.Scanner;

public class DogFood {
    public static void main(String[] args){
        // 강아지의 몸무게를 입력받아 1일 권장 사료 급여량 계산하여 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        System.out.println("강아지의 몸무게를 입력하세요.");
        String Weight = scanner.nextLine();
        try {
            double DogWeight = Double.parseDouble(Weight);
            double Eat = DogWeight * 10;
            System.out.println("하루 급여량은 " + Eat + "g 입니다.");
        }catch (Exception e){
            System.out.println("몸무게를 입력받지 못했습니다.");
        }
    }
}
