public class Carro1 {
    String marca; 
    String modelo; 
    String cor;

    public Carro1 (String marca, String modelo, String cor) {
        this.marca  = marca;
        this.modelo = modelo;
        this.cor    = cor;
    }

    private String getMarca() {
        return marca;
    }

    private String getModelo() {
        return modelo;
    }

    private String getCor() {
        return cor;
    }

    public static void main(String[] args){
        Carro1 meuCarro = new Carro1("Fiat", "Uno", "Preto");
        System.out.println("Meu carro é um "+meuCarro.getMarca()+ " "+meuCarro.getModelo()+" de cor "+meuCarro.getCor());
    }
}