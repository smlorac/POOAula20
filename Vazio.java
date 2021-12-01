package Aula20.Mesa;

public class Vazio implements Estado{

    private Carrinho c;

    public Vazio(Carrinho c) {
        this.c = c;
    }

    @Override
    public void obterEstado() {
        System.out.println("Vazio");
    }
}
