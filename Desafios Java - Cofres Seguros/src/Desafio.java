import java.util.Scanner;

/*
Descrição
Você foi contratado para desenvolver um sistema de cofres seguros.
O objetivo é criar dois tipos de cofres: um Cofre Digital, que é aberto por senha, e um Cofre Físico, que é aberto por chave.

Entrada
O programa irá solicitar ao usuário que digite o tipo de cofre a ser criado: "digital" ou "físico".
Se for escolhido o tipo "digital", o programa irá solicitar a senha e a confirmação de senha do cofre digital (ambas com apenas números).
Caso seja escolhido o tipo "físico", não é necessário nenhuma outra entrada.

Saída
O programa irá exibir as informações do cofre criado.
Para o Cofre Digital, será exibido o tipo e o método de abertura (senha). Para o Cofre Físico, será exibido apenas o tipo e o método de abertura (chave).

Ex:
Entrada: digital
12345
1234

Tipo: Cofre Digital
Metodo de abertura: Senha
Senha incorreta!

Entrada: fisico

Tipo: Cofre Fisico
Metodo de abertura: Chave

Entrada: digital
2525
2525

Tipo: Cofre Digital
Metodo de abertura: Senha
Cofre aberto!

*/
abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

}

public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo de cofre(digital / fisico): ");
        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            System.out.println("Digite a senha: ");
            int senha = scanner.nextInt();
            System.out.println("Digite a confirmação da senha: ");
            int confirmacaoSenha = scanner.nextInt();

            CofreDigital cofreDigital = new CofreDigital(senha);
            if (cofreDigital.validarSenha(confirmacaoSenha)) {
                cofreDigital.imprimirInformacoes();
                System.out.println("Cofre aberto!");
            } else {
                cofreDigital.imprimirInformacoes();
                System.out.println("Senha incorreta!");
            }
        }
        else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }
        else {
            System.out.println("Tipo de cofre inválido!");
        }
    }
}