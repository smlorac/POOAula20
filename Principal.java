package Aula20.Mesa;

public class Principal {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Produto p1 = new Produto("Cenouras", 4);

        carrinho.obterEstado();

        //carregando o carrinho
        carrinho.proximoEstado();
        carrinho.adicionar(p1);
        carrinho.obterEstado();

        //limpando o carrinho
        carrinho.cancelar();
        carrinho.obterEstado();

    }
}
