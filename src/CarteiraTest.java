import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CarteiraTest {

    @Test
    void naoDeveCriarComSaldoNegativo() {
        // TODO Tarefa 7: assertThrows(ValorInvalidoException.class, () -> new Carteira(-0.01), "...")
    }

    @Test
    void deveDepositarValorValido() {
        // TODO Tarefa 7: criar Carteira(10), depositar(5), assertEquals(15, getSaldo(), ...)
    }

    @Test
    void saqueAcimaDoSaldoNaoAlteraEstado() {
        // TODO Tarefa 8: saldo antes; assertThrows SaldoInsuficienteException; assertEquals saldo depois
    }

    @Test
    void transferenciaValidaMoveValores() {
        // TODO Tarefa 9: origem 50, destino 10; transferirPara(destino, 20);
        // TODO Tarefa 9: origem 30, destino 30
    }

    @Test
    void transferenciaComSaldoInsuficienteNaoAlteraNenhumaCarteira() {
        // TODO Tarefa 9: origem 10, destino 5; assertThrows ao transferir 10.01;
        // TODO Tarefa 9: origem continua 10 e destino continua 5
    }

    /** Já pronto — indica o erro da Tarefa 10. Deve passar após corrigir estornar. */
    @Test
    void estornoComValorInvalidoNaoAlteraSaldo() {
        Carteira c = new Carteira(40.0);
        double antes = c.getSaldo();
        assertThrows(ValorInvalidoException.class, () -> c.estornar(0.0),
                "estorno com valor <= 0 deveria lancar ValorInvalidoException");
        assertEquals(antes, c.getSaldo(), 0.001,
                "saldo nao deveria mudar quando o estorno e invalido");
    }
}
