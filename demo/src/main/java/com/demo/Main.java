public class Main {

    public static void main(String[] args) {
        ContaMagica minhaConta = new ContaMagica("1234-5", "Fulano");
        System.out.println(minhaConta.getNumeroConta()); // imprime "1234-5"
        System.out.println(minhaConta.getNomeCorrentista()); // imprime "Fulano"
        System.out.println(minhaConta.getSaldo()); // imprime 0.0
        System.out.println(minhaConta.getCategoria()); // imprime "Silver"

        minhaConta.deposito(1000);
        System.out.println(minhaConta.getSaldo()); // imprime 1000.0
        System.out.println(minhaConta.getCategoria()); // imprime "Silver"

        minhaConta.deposito(50000);
        System.out.println(minhaConta.getSaldo()); // imprime 51000.0

        System.out.println(minhaConta.getCategoria()); // imprime "Gold"

        minhaConta.retirada(20000);
        System.out.println(minhaConta.getSaldo()); // imprime 30980.0
        System.out.println(minhaConta.getCategoria()); // imprime "Gold"

        minhaConta.retirada(40000);
        System.out.println(minhaConta.getSaldo());
    }
}