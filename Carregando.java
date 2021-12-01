package Aula20.Mesa;

public class Carregando implements Estado{

    private Carrinho c;

    public Carregando(Carrinho c) {
        this.c = c;
    }

    @Override
    public void obterEstado() {
        System.out.println("Carregando");
    }
}
