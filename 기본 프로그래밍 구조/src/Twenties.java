import java.util.Scanner;
public class Twenties {

    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.print("나이를 입력하세요: ");
      int age = scanner.nextInt();
      if ((age >= 20) && (age < 30)){
          System.out.println("20대 입니다.");
          System.out.println("20대");
      }
      else{
          System.out.println("20대가 아닙니다");

      }
      scanner.close();

    }
}
