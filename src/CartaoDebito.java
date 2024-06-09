public class CartaoDebito {
    private Conta contaAssociada;
    private String numeroCartao;
    private String dataValidade;
    private String cvv;

    public CartaoDebito(Conta contaAssociada, String numeroCartao, String dataValidade, String cvv) {
        this.contaAssociada = contaAssociada;
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }

    public void realizarSaque(double valor) {
        if (contaAssociada.getSaldo() >= valor) {
            contaAssociada.sacar(valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void realizarCompra(double valor) {
        if (contaAssociada.getSaldo() >= valor) {
            contaAssociada.sacar(valor);
            System.out.println("Compra de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para compra.");
        }
    }

    public Conta getContaAssociada() {
        return contaAssociada;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public String getCvv() {
        return cvv;
    }
}
