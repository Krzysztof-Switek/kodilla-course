import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose a year");
        int userYear = scan.nextInt();

        int modulo4 = userYear%4;
        int modulo100 = userYear%100;
        int modulo400= userYear%400;

        if (modulo4!=0){
            System.out.println("Year " + userYear + " is not a leap year");
        } else if (modulo100!=0){
            System.out.println("Year " + userYear + " is a leap year");
        } else if (modulo400!=0){
            System.out.println("Year " + userYear + " is not a leap year");
        } else {
            System.out.println("Year " + userYear + " is a leap year");
        }

    }
}


