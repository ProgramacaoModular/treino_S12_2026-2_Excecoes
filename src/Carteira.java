/**
 * Carteira digital da Xulambs.
 * Tarefas 3 a 6: implementar. Tarefa 10: corrigir estornar.
 */
public class Carteira {
    private double saldo;

    public Carteira(double saldoInicial) {
        // TODO Tarefa 3: se saldoInicial < 0, lançar ValorInvalidoException; senão atribuir
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        // TODO Tarefa 4: valor > 0; senão ValorInvalidoException; depois creditar
    }

    public void sacar(double valor) {
        // TODO Tarefa 5: valor <= 0 → ValorInvalidoException
        // TODO Tarefa 5: valor > saldo → SaldoInsuficienteException
        // TODO Tarefa 5: só então debitar
    }

    public void transferirPara(Carteira destino, double valor) {
        // TODO Tarefa 6: validar valor e saldo; em sucesso debitar nesta e creditar em destino
        // TODO Tarefa 6: em falha, nenhuma carteira muda
    }

    /**
     * Estorna (credita) um valor na carteira.
     * Tarefa 10: este método está incorreto — o teste estornoComValorInvalidoNaoAlteraSaldo falha.
     * Altere-o para validar antes de modificar o saldo (fail-fast).
     */
    public void estornar(double valor) {
        saldo += valor;
        if (valor <= 0) {
            throw new ValorInvalidoException("estorno deve ser maior que zero");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
