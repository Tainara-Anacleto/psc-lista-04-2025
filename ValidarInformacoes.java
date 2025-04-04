import java.util.Scanner;

public class ValidarInformacoes {
    public static void main(String[] args){

        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;

        Scanner scanner = new Scanner(System.in);

        do{
        System.out.println("Informe seu nome (maior que três caracteres): ");
        nome = scanner.nextLine();
        if (nome.length() < 3){
            System.out.println("Informação Inválida.");
        }
        }while (nome.length() < 3);

        do{
            System.out.println("Informe sua idade (entre 0 e 150 anos): ");
            idade = scanner.nextInt();
            if(idade < 0 || idade > 150){
                System.out.println("Informação Inválida.");
            }
        }while (idade < 0 || idade > 150);
            
        do{
            System.out.println("Informe seu salário (maior que 0): ");
            salario = scanner.nextDouble();
        if(salario <= 0){
            System.out.println("Informação Inválida.");
        }
         }while (salario <= 0);
            
        do{
            System.out.println("Informe seu sexo (F ou M): ");
            sexo = scanner.next().charAt(0);
        if(sexo != 'f' && sexo != 'm'){
            System.out.println("Informação Inválida."); 
        }
        }while (sexo != 'f' && sexo != 'm');

        do{
            System.out.println("Informe seu estado civil (s/c/v/d): ");
            estadoCivil = scanner.next().charAt(0);
        if(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd'){
            System.out.println("Informação Inválida.");
        }
        }while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
            
        System.out.println("Informações válidas!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civl: " + estadoCivil);
        
        scanner.close();
        }
        
    }

