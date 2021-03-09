import java.util.Scanner;

public class collatzAlgorithm {

    public static void odd(int n){
        int number = (n * 3) + 1;
        System.out.println(number);
        if (number % 2 == 0) {
            even(number);
        }
        else{
            odd(number);
        }
    }

    public static void even(int n){
        int number = (n / 2);
        if (number == 1){
            System.out.println(number);
        }
        else {
            System.out.println(number);
            if (number % 2 == 0) {
                even(number);
            } else {
                odd(number);
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n == 1){
            System.out.println(n);
        }
        else {
            if (n % 2 == 0){
                even(n);
            }
            else{
                odd(n);
            }
        }
    }
}
