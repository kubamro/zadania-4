import java.util.Scanner;
public class TestTriangle {

    public static void main(String[] args) {

        double sidea;
        double sideb;
        double sidec;


        Scanner in = new Scanner(System.in);
        System.out.println("Aby sprawdzić czy podany trójkąt jest prostokątny wprowadź kolejno jego 3 boki: ");

        System.out.printf("Podaj bok 1:");sidea = in.nextDouble();
        System.out.printf("Podaj bok 2:");sideb = in.nextDouble();
        System.out.printf("Podaj bok 3:");sidec = in.nextDouble();

        System.out.println("");

        if (((sidea * sidea) + (sideb * sideb)) == (sidec * sidec)){
            System.out.println("Trójkąt jest prostokątny");
        }
        else if (((sidea * sidea) + (sidec * sidec)) == (sideb * sideb)){
            System.out.println("ten trójkąt jest prostokątny");
        }
        else if (((sidec * sidec) + (sideb * sideb)) == (sidea * sidea)){
            System.out.println("ten trójkąt jest prostokątny");
        }
        else{
            System.out.println("ten trójkąt nie jest prostokątny");
        }
    }

}
