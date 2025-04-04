import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args){
        
        int numero, quantidade = 5;
        double media, soma = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < quantidade; i++){
            System.out.println("Digite um número " + (i + 1) + ": ");
            numero = scanner.nextInt();
            soma += numero ;
        }
        media = soma / quantidade;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
