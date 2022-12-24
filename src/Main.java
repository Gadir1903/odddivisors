import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //12
        for (int i = 3; i < a; i++) {  // a = 12 , i = 3
            if (i % 3 == 0 && i % 2 != 0 ){
                System.out.println(i);
            }
        }
    }
}