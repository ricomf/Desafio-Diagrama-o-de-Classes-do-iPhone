import Entidade.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar("Lofi Brazil Song");
        iphone.pausar();
        iphone.selecionarMusica();

        iphone.ligar("81 999999999");
        iphone.atender();
        iphone.iniciarCorrerioVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
