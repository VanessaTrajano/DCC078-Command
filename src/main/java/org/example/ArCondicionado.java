package org.example;

public class ArCondicionado {

    private String comodo;
    private int temperatura;
    private String situacao;

    public ArCondicionado(String comodo, int temperatura) {
        this.comodo = comodo;
        this.temperatura = temperatura;
    }

    public String getSituacao() {
        return situacao;
    }

    public void ligar() {
        this.situacao = "Ar-condicionado ligado";
    }

    public void desligar() {
        this.situacao = "Ar-condicionado desligado";
    }
}