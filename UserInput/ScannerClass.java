import java.util.Scanner;

public class ScannerClass {
    public static void main(String args[]){
        System.out.print("Enter a: ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        System.out.println("The value of a is " + a);
        inp.close();
    }
}
