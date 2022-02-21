package com.ndrewcoding.escola.shared.dominio.evento;

import java.time.LocalDateTime;

public interface Evento {

    LocalDateTime momento();

    TipoDeEvento tipo();

}
