public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jose");
        pessoa.setIdade(27);

        System.out.println(pessoa);

        System.out.println(pessoa.cumprimentar());
    }
}