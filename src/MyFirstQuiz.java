import java.util.Scanner;
import static java.lang.Math.sqrt;

public class MyFirstQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double question3Answer = sqrt(15129);
        int score = 0;

        Quiz question1 = new Quiz("Jaki jest wynik mnożenia 3*5?",3*5);
        Quiz question2 = new Quiz("Jakie jest pole kwadratu o boku 12?",12*12);
        Quiz question3 = new Quiz("Jaki jest pierwiastek kwadratowy z liczby 15129?", question3Answer);


        System.out.printf('\n'+"Witam w moim pierwszym quizie! Powodzenia!:)"+'\n');
        System.out.printf('\n'+question1.question+'\n');

        double answer1 = scanner.nextDouble();
        if(answer1==question1.answer) {
            score++;
            System.out.printf("Brawo! Zgadłeś."+'\n');
        }
        else {
                System.out.printf("Twoja odpowiedź jest niepoprawna."+'\n');

        }


        System.out.println(question2.question);
        double answer2 = scanner.nextDouble();
        if(answer2==question2.answer) {
            score++;
            System.out.printf("Brawo! Zgadłeś."+'\n');
        }
        else {
            System.out.printf("Twoja odpowiedź jest niepoprawna."+'\n');

            System.out.println(question3.question);


            double answer3 = scanner.nextDouble();
            if (answer3 == question3.answer) {
                score++;
                System.out.println("Brawo! Zgadłeś."); }
            else { System.out.printf("Twoja odpowiedź jest niepoprawna." + '\n'); }


            System.out.printf('\n'+'\n'+"Podsumowanie oraz poprawne odpowiedzi na pytania:"+'\n'+'\n');

            System.out.printf('\n'+"Pytanie 1." + '\n' + question1.question + '\n' + "Twoja odpowiedź: " + answer1 + '\n'+"Poprawna odpowiedź: "+question1.answer+ '\n');
            System.out.printf('\n'+"Pytanie 2." + '\n' + question2.question + '\n' + "Twoja odpowiedź: " + answer2 + '\n'+"Poprawna odpowiedź: "+question2.answer+ '\n');
            System.out.printf('\n'+"Pytanie 3." + '\n' + question3.question + '\n' + "Twoja odpowiedź: " + answer3 + '\n'+"Poprawna odpowiedź: "+question3.answer+ '\n');
            System.out.printf('\n'+"Uzyskane punkty: "+score+"/3pkt.");

                }
            }

    }


