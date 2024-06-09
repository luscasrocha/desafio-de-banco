public class Teste {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente();
        CartaoDebito cartao = new CartaoDebito(conta, "1234 5678 9876 5432", "12/25", "123");

        conta.depositar(1000);
        cartao.realizarSaque(200);
        cartao.realizarCompra(150);

        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}