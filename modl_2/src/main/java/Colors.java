
import java.util.Scanner;
public class Colors {
    public static String getUserLetter(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Type in a first letter of a choosen color: red, blue, green:");
        String choosenLetter = scr.nextLine().trim().toLowerCase();
        switch (choosenLetter) {
            case "r": return "RED";
            //break;
            case "b": return "BLUE";
            //break;
            case "g": return "GREEN";
            //break;
            default: System.out.println("Wrong letter");


        }

        return choosenLetter;
    }





    public static void main(String[] args) {
        Colors colors = new Colors();
        String chosenColor = colors.getUserLetter();
        System.out.println("Your color is: " + chosenColor);
    }




}
