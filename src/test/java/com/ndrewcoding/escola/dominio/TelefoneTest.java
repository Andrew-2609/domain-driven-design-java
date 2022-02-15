package com.ndrewcoding.escola.dominio;

import com.ndrewcoding.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelefoneTest {

    @Test
    void deveriaCriarTelefoneComDDDENumeroValidos() {
        assertDoesNotThrow(() -> new Telefone("85", "91234-5678"));
    }

    @Test
    void naoDeveriaCriarTelefonesComDDDOuNumeroInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));

        assertThrows(IllegalArgumentException.class, () -> new Telefone("", ""));

        IllegalArgumentException exceptionCausedByInvalidDDD = assertThrows(IllegalArgumentException.class, () -> new Telefone("OK", "91234-5678"));
        IllegalArgumentException exceptionCausedByInvalidNumero = assertThrows(IllegalArgumentException.class, () -> new Telefone("85", "51234-5678"));

        assertEquals("DDD inválido!", exceptionCausedByInvalidDDD.getMessage());

        assertEquals("Número de telefone inválido!", exceptionCausedByInvalidNumero.getMessage());
    }

}
