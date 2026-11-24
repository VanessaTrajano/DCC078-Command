package org.example;

public class DesligarArCondicionadoComando implements Comando {

    private ArCondicionado arCondicionado;

    public DesligarArCondicionadoComando(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public void executar() {
        this.arCondicionado.desligar();
    }

    public void cancelar() {
        this.arCondicionado.ligar();
    }
}