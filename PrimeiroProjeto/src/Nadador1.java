public class Nadador1 {
    String nome;
    int idade;

    public Nadador1 (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static void main (String[] args) {
        Nadador1 nadador = new Nadador1 ("Ybson", 22);
        System.out.println("Nome: " + nadador.getNome() + " e " + "idade: " + nadador.getIdade());
    }
}