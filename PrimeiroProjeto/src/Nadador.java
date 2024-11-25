public class Nadador {
    String nome;
    int idade;

    void forca () {
        System.out.println("Força");
    }
    void resistencia () {
        System.out.println("Resistência");
    }
    void velocidade () {
        System.out.println("Velocidade");
    }  
    public static void main(String[] args) throws Exception{
        Nadador nadador = new Nadador();
        nadador.nome = "Neymar";
        nadador.idade = 28;

        System.out.println("Nadador "+nadador.nome+ " de "+nadador.idade+" de idade");

        nadador.forca();
        nadador.resistencia();
        nadador.velocidade();
        
    } 
}