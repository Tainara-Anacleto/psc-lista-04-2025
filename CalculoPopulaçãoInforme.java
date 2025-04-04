import java.util.Scanner;

public class CalculoPopulaçãoInforme {
    public static void main(String[] args) {
        
        double populacaoA = 0, populacaoB = 0, taxaA = 0, taxaB = 0;
        int anos = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a população do País A: ");
        populacaoA = scanner.nextDouble();
        System.out.println("Informe a taxa anual de crescimento da população A: ");
        taxaA = scanner.nextDouble();
        System.out.println("Informe a população do País B: ");
        populacaoB = scanner.nextDouble();
        System.out.println("Informe a taxa anual de crescimento da população B: ");
        taxaB = scanner.nextDouble();

        while (populacaoA <= populacaoB){
            populacaoA = populacaoA + (populacaoA * taxaA);
            populacaoB = populacaoB + (populacaoB * taxaB);
            anos = anos + 1;
        }
        System.out.println("Serão necessários " + anos + " anos para que a população A ultrapasse ou iguale a população do país B.");

        scanner.close();
    }
}

