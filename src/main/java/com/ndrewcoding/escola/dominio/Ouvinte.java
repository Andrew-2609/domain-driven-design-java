package com.ndrewcoding.escola.dominio;

public abstract class Ouvinte {

    public void processar(Evento evento) {
        if (this.deveProcessar(evento)) {
            this.reageAo(evento);
        }
    }

    protected abstract boolean deveProcessar(Evento evento);

    protected abstract void reageAo(Evento evento);

}
