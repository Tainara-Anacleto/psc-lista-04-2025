import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        
        String nomeUsuario, senhaUsuario;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário: ");
        nomeUsuario = scanner.nextLine();

        System.out.println("Informe a senha: ");
        senhaUsuario = scanner.nextLine();

        while (nomeUsuario.equals(senhaUsuario)){
            System.out.println("Erro: A senha não pode ser igual ao nome de usuário.");
            System.out.println("Digite seu nome de usuário: ");
            nomeUsuario = scanner.nextLine();
            System.out.println("Informe a senha: ");
            senhaUsuario = scanner.nextLine();
        }
        if (nomeUsuario != senhaUsuario){
            System.out.println("Login efetuado com sucesso!");
        }
        scanner.close();
    }
}
