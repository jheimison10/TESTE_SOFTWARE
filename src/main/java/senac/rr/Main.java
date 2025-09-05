package senac.rr;
public class Main {
    public static void main(String[] args) {
        pessoa pessoa1 = new pessoa();
        pessoa1.setNome("jheimison");
        pessoa1.setIdade(30);
        pessoa1.setCpf("005.508.962-36");

        System.out.println(pessoa1.getnome());
        System.out.println(pessoa1.getCpf(null));
        System.out.println(pessoa1.getIdade());
    }
}