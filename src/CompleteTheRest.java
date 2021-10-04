import java.util.Scanner;

public class CompleteTheRest {
    public static void main(String[] args){
        int min = 999, max = 0, sum = 0;
        double avg = 0;
        int score, counter = 0;

        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a test score. Type -1 to quit.");
        score = keybd.nextInt();
        keybd.nextLine();

        while (score != -1){
            if (score < min)
                min = score;
            if (score > max)
                max = score;
            counter += 1;
            sum += score;
            System.out.println("Enter another test score. Type -1 to quit.");
            score = keybd.nextInt();
            keybd.nextLine();
            }

        if (counter > 0)
            avg = sum / counter;
        if (min == 999) //If no data was entered
            min = 0;
        System.out.println("Min: " + min + " Max: " + max + " Avg: " + avg);
    }
}
