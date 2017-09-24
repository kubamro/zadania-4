import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        Weekday monday = new Weekday("Monday",1,"working day");
        Weekday tueday = new Weekday("Tuesday",2,"working day");
        Weekday wednesday = new Weekday("Wednesday",3,"working day");
        Weekday thursday = new Weekday("Thursday",4,"working day");
        Weekday friday = new Weekday("Friday",5,"working day");
        Weekday saturday = new Weekday("Saturday",6,"weekend");
        Weekday sunday = new Weekday("Sunday",7,"weekend");

        System.out.println("Enter any number of the week:");
        int one = scanner.nextInt();{
            if (one == 1){
                System.out.println("You entered day number: " + monday.numberOfTheWeek);
                System.out.println(monday.weekday +" is: a working day");

            }
            else if (one == 2){
                System.out.println("You entered day number: " + tueday.numberOfTheWeek);
                System.out.println(tueday.weekday +" is: a working day");

            }
            else if (one == 3){
                System.out.println("You entered day number: " + wednesday.numberOfTheWeek);
                System.out.println(wednesday.weekday +" is: a working day");

            }
            else if (one == 4){
                System.out.println("You entered day number: " + thursday.numberOfTheWeek);
                System.out.println(thursday.weekday +" is: a working day");

            }
            else if (one == 5){
                System.out.println("You entered day number: " + friday.numberOfTheWeek);
                System.out.println(friday.weekday +" is: a working day");

            }
            else if (one == 6){
                System.out.println("You entered day number: " + saturday.numberOfTheWeek);
                System.out.println(saturday.weekday +" is: weekend");

            }
            else if (one == 7){
                System.out.println("You entered day number: " + sunday.numberOfTheWeek);
                System.out.println(sunday.weekday +" is: weekend");

            }
            else{
                System.out.println("You can only enter number 1-7");
            }
        }


    }
}
