package david.august.luan.entidades;

import java.util.*;

public class Pedido {
    private Random codigo;
    private String comida;
    private String bebida;
    private double preco;
    private Date dataPedido;

    public Pedido(String comida, String bebida, double preco) {
        this.codigo = new Random();
        this.comida = comida;
        this.bebida = bebida;
        this.preco = preco;
        this.dataPedido = new Date();
    }

    // gerar um cod capaz de pegar 10 numeros aleatorios
    public int codigoPedido(Random codigo) {
        int cod = 0;
        // para i menor que 10 incremente i
        for (int i = 0; i < 10; i++) {
            // armazenando a sequencia numerica na variavel cod
            cod = codigo.nextInt();
        }
        return cod;// retorno
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
}
