package equipamento;

import navegador.Navegador;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Equipamento implements ReprodutorMusical, AparelhoTelefonico, Navegador {

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba com equipamento");
    }
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina com equipamento");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina com equipamento");
     }

    @Override
    public void ligar() {
        System.out.println("Ligando com equipamento");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo com equipamento");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz com equipamento");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica com equipamento");
     }

    @Override
    public void tocar() {
        System.out.println("tocando musica com equipamento");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica com equipamento");
     }

    }


