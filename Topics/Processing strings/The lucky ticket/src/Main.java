import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String numeros = scanner.nextLine();
        int primeiros = 0;
        int ultimos = 0;

        for (int i = 0; i < 3; i++) {
            primeiros += Character.getNumericValue(numeros.charAt(i));
            ultimos += Character.getNumericValue(numeros.charAt(i + 3));
        }
        if (primeiros == ultimos) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}