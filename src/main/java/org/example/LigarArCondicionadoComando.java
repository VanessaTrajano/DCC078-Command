package org.example;

public class LigarArCondicionadoComando implements Comando {

    private ArCondicionado arCondicionado;

    public LigarArCondicionadoComando(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public void executar() {
        this.arCondicionado.ligar();
    }

    public void cancelar() {
        this.arCondicionado.desligar();
    }
}