import java.util.Scanner;
public class ProjetoLogin{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login, senha;
        System.out.println("Digite um login: ");
        login = scanner.nextLine();
        System.out.println("Digite uma senha: ");
        senha = scanner.nextLine();
        while (!validarSenha(login , senha)){
            System.out.println("Senha invalida!");
            System.out.println("A senha deve conter no minimo 8 caracteres e no maximo 16, nao podendo ser a mesma do login");
            System.out.println("Digite um login: ");
            login = scanner.nextLine();
            System.out.println("Digite uma senha: ");
            senha = scanner.nextLine();
        }
            System.out.println("Senha e login corretos, parabéns!");

        scanner.close();

    }
    public static boolean validarSenha(String login , String senha){
        boolean senhaValidacao = false;
        boolean contemMaiuscula = false;
        boolean contemMinuscula = false;
        boolean contemNumero = false;
       if (!senha.equals(login) && senha.length() > 7 && senha.length() < 16) {
            for (char caracteres : senha.toCharArray()) {
                if (Character.isUpperCase(caracteres)) {
                    contemMaiuscula = true;
                } else if (Character.isLowerCase(caracteres)) {
                    contemMinuscula = true;
                } else if (Character.isDigit(caracteres)) {
                    contemNumero = true;
                }
            }

            if (contemMaiuscula && contemMinuscula && contemNumero) {
                senhaValidacao = true;
            }
        }

        return senhaValidacao;
    }
}