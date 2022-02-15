package com.ndrewcoding.escola.dominio;

import com.ndrewcoding.escola.dominio.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTest {

    @Test
    void deveriaCriarEmailComEnderecoValido() {
        assertDoesNotThrow(() -> new Email("email.valido@gmail.com"));
    }

    @Test
    void naoDeveriaCriarEmailComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));

        assertThrows(IllegalArgumentException.class, () -> new Email(""));

        assertThrows(IllegalArgumentException.class, () -> new Email("emailInvalido"));
    }

}
