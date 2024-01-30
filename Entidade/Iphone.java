package Entidade;

import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;

public class Iphone implements NavegadorInternet,  ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void ligar(String cell) {
        System.out.println("Ligando para " + cell);
        
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Reproduzindo correio de voz");
        
    }

    @Override
    public void atender() {
        System.out.println("Chamada iniciada!");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando música: " + musica);
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba!");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página!");
        
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
        
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada!");
        
    }

 
    
}
