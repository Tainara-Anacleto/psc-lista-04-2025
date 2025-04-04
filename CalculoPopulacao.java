public class CalculoPopulacao {
    public static void main(String[] args) {
        
        double populacaoA = 80000, populacaoB = 200000;
        int anos = 0;

        while (populacaoA <= populacaoB){
            populacaoA = populacaoA + (populacaoA * 0.03);
            populacaoB = populacaoB + (populacaoB * 0.015);
            anos = anos + 1;
        }
        System.out.println("Serão necessários " + anos + " anos para que a população A ultrapasse ou iguale a população do país B.");
    }
}
