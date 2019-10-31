import java.util.ArrayList;
import java.util.Scanner;

public class ExpITAss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        int occurrence = 0;
        int inputnumber;
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Enter Numbers:");
        do {
            inputnumber = input.nextInt();

            al.add(inputnumber);
        } while (inputnumber != 0);

        //For each
        for (int num:al
             ) {
            if (num > largest) {
                occurrence = 0;
                largest = num;
            }
            if (num == largest) {
                occurrence++;
            }

        }/*
        //for loop
        for (int counter=0;counter<al.size();counter++) {

            if (al.get(counter) > largest) {
                occurrence = 0;
                largest = al.get(counter);
            }
            if (al.get(counter) == largest) {
                occurrence++;
            }
        }
*/
        System.out.println("The largest number is " + largest);
        System.out.println("The occurrence count is " + occurrence);
    }
}
