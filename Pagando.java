package Aula20.Mesa;

public class Pagando implements Estado{

    private Carrinho c;

    public Pagando(Carrinho c) {
        this.c = c;
    }

    @Override
    public void obterEstado() {
        System.out.println("Pagando");
    }
}
