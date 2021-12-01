package Aula20.Mesa;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos = new ArrayList<>();
    private Estado estado;

    public Carrinho() {
         setEstado(new Vazio(this));
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void cancelar(){
        setEstado(new Vazio(this));
        produtos.clear();
    }

    public void adicionar(Produto produto){
        produtos.add(produto);
    }

    public void proximoEstado(){
        if (getEstado() instanceof Vazio){
            setEstado(new Carregando(this));
        } else if (getEstado() instanceof Carregando){
            setEstado(new Pagando(this));
        } else if (getEstado() instanceof Pagando){
            setEstado(new Fechado(this));
        } else {
            cancelar();
        }
    }

    public void estadoAnterior(){
        if (getEstado() instanceof Carregando){
            cancelar();
        } else if (getEstado() instanceof Pagando){
            setEstado(new Carregando(this));
        }
    }

    public void obterEstado(){
        estado.obterEstado();
    }
}
