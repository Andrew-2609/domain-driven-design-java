package com.ndrewcoding.escola.dominio;

import com.ndrewcoding.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {

    @Test
    void deveriaCriarCPFComNumeroValido() {
        assertDoesNotThrow(() -> new CPF("123.456.789-00"));
    }

    @Test
    void naoDeveriaCriarCPFsComNumeroInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("12345678900"));
    }

}
