import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        
        int nota;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = scanner.nextInt();

        while (nota>10){
        System.out.println("Nota informada é inválida.");
        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = scanner.nextInt();   
        }

        while (nota<0){
        System.out.println("Nota informada é inválida.");
        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = scanner.nextInt();    
        }
        scanner.close();
    }
}
