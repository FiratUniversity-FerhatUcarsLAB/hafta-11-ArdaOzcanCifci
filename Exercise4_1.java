
import java.util.Scanner;

public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        String dateString = "";
        if(date == 1){
            dateString = "Monday";
        }
        else if(date == 2){
            dateString = "Tuesday";
        }
        else if(date == 3){
            dateString = "Wednesday";
        }
        else if(date == 4){
            dateString = "Thursday";
        }
        else if(date == 5){
            dateString = "Friday";
        }
        else if(date == 6){
            dateString = "Saturday";
        }
        else{
            dateString = "Sunday";
        }
        System.out.println(dateString + ", " + month +" " + day + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        
        String dateString = "";
        if(date == 1){
            dateString = "Monday";
        }
        else if(date == 2){
            dateString = "Tuesday";
        }
        else if(date == 3){
            dateString = "Wednesday";
        }
        else if(date == 4){
            dateString = "Thursday";
        }
        else if(date == 5){
            dateString = "Friday";
        }
        else if(date == 6){
            dateString = "Saturday";
        }
        else{
            dateString = "Sunday";
        }
        System.out.println(day + " " + month +" " + year + ", " + dateString);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Gunu girin : ");
        String day = input.nextLine();

        System.out.print("haftanin hangi gunu oldugunu girin : ");
        int date = input.nextInt();
        input.nextLine();
        
        System.out.print("ayi girin : ");
        String month = input.nextLine();

        System.out.print("yili girin : ");
        int year = input.nextInt();


        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);
    }
}
