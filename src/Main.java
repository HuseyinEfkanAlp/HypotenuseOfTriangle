import com.sun.jdi.Value;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the 1st angle of the triangle : ");
        int a = scn.nextInt();
        System.out.print("Enter the 2nd angle of the triangle : ");
        int b = scn.nextInt();
        double c = Math.sqrt((a*a)+(b*b));

        System.out.println("hypotenuse of the values you entered : " +c);
    }
}
