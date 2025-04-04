import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        
        int menorNum, maiorNum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o menor número: ");
        menorNum = scanner.nextInt();

        System.out.println("Informe o maior número: ");
        maiorNum = scanner.nextInt();

        while (menorNum >= maiorNum){
            System.out.println("O primenrio número informado, deve ser maior que o segundo.");
            System.out.println("Informe o menor número: ");
            menorNum = scanner.nextInt();
            System.out.println("Informe o maior número: ");
            maiorNum = scanner.nextInt();
        }
        for (int i = menorNum; i <= maiorNum; i++){
            System.out.println(i);
        }
        scanner.close();
    }
}
