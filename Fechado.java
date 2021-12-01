package Aula20.Mesa;

public class Fechado implements Estado{

    private Carrinho c;

    public Fechado(Carrinho c) {
        this.c = c;
    }


    @Override
    public void obterEstado() {
        System.out.println("Fechado");
    }
}
