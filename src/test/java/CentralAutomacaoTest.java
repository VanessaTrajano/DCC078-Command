import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CentralAutomacaoTest {

    CentralAutomacao centralAutomacao;
    ArCondicionado arCondicionado;

    @BeforeEach
    void setUp() {
        centralAutomacao = new CentralAutomacao();
        arCondicionado = new ArCondicionado("Sala", 22);
    }

    @Test
    void deveLigarArCondicionado() {
        Comando ligarArCondicionado = new LigarArCondicionadoComando(arCondicionado);
        centralAutomacao.executarComando(ligarArCondicionado);

        assertEquals("Ar-condicionado ligado", arCondicionado.getSituacao());
    }

    @Test
    void deveDesligarArCondicionado() {
        Comando desligarArCondicionado = new DesligarArCondicionadoComando(arCondicionado);
        centralAutomacao.executarComando(desligarArCondicionado);

        assertEquals("Ar-condicionado desligado", arCondicionado.getSituacao());
    }

    @Test
    void deveCancelarDesligamentoArCondicionado() {
        Comando ligarArCondicionado = new LigarArCondicionadoComando(arCondicionado);
        Comando desligarArCondicionado = new DesligarArCondicionadoComando(arCondicionado);

        centralAutomacao.executarComando(ligarArCondicionado);
        centralAutomacao.executarComando(desligarArCondicionado);

        centralAutomacao.cancelarUltimoComando();

        assertEquals("Ar-condicionado ligado", arCondicionado.getSituacao());
    }

}