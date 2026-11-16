import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String[] palvaras = sentence.split(" ");
        String palavraMaisLonga = "";
        for (String palavra : palvaras) {
            if (palavra.length() > palavraMaisLonga.length()) {
                palavraMaisLonga = palavra;
            }
        }
        System.out.println(palavraMaisLonga);
        // Your code here
    }
}