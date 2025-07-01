import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;


public class DayOfTheWeek {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Year");
    int year = sc.nextInt();

    System.out.println("Enter month");
    int month = sc.nextInt();

    System.out.println("Enter Day");
    int day = sc.nextInt();
    LocalDate D = LocalDate.of(year,month,day);
    DayOfWeek Day = D.getDayOfWeek();

    System.out.println("Day of the week "+Day);

  }
  
}
