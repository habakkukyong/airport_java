import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Instruct airport");
        String command = input.nextLine();
        System.out.println("You issued the instruction: " + command);
    }
}
