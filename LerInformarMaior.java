import java.util.Scanner;

public class LerInformarMaior {
    public static void main(String[] args) {
        
        int maiorNum, numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        maiorNum = scanner.nextInt();

        for (int i = 1; i < 5; ++i){
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
        
        if (numero > maiorNum){
            maiorNum = numero;
        }
    }
    System.out.println("O maior número é: " + maiorNum);

    scanner.close();
    }
}
