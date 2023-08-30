/*
    Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência.
    A diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de:

    - Reprodutor Musical
    - Aparelho Telefônico
    - Navegador na Internet
*/
public class Main extends iPhone{
    public static void main(String[] args) {
        System.out.println("Hello and welcome! to iPhone 2017\n\n");
        iPhone iPhone = new iPhone();

        System.out.println("Testando métodos da interface Reprodutor de Musicas");
        iPhone.selecionarMusica();
        iPhone.tocarMusica();
        iPhone.pausarMusica();
        iPhone.continuarMusica();
        iPhone.aumentarVolume();
        iPhone.diminuirVolume();
        System.out.println("Fim dos testes da interface Reprodutor de Musicas\n\n");

        System.out.println("Testando métodos da interface Telefone");
        iPhone.ligar(123456789);
        iPhone.atender();
        iPhone.chamadaEmEspera();
        iPhone.iniciarConferencia();
        iPhone.escutarCorreioVoz();
        System.out.println("Fim dos testes da interface Telefone\n\n");

        System.out.println("Testando métodos da interface Navegador");
        iPhone.abrirnavegador();
        iPhone.pesquisarPagina();
        iPhone.adicionarPaginaNova();
        iPhone.trocarDePagina();
        iPhone.fecharPaginaAtual();
        iPhone.fecharNavegador();
        System.out.println("Fim dos testes da interface Navegador\n\n");
    }
}