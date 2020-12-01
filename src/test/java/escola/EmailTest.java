package escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));
        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));
        assertThrows(IllegalArgumentException.class,
                () -> new Email("email_invalido"));
    }

    @Test
    void deveriaCriarEmailsComEnderecosValidos() {
        assertEquals("teste@teste.com", new Email("teste@teste.com").getEndereco());
        assertEquals("teste@teste.com.br", new Email("teste@teste.com.br").getEndereco());
    }
}