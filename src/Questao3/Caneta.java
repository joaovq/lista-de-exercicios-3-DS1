package Questao3;

public class Caneta {
    private String marca;
    private String cor;
    private int tamanho;


    public Caneta(String marca, String cor, int tamanhoEmCm) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanhoEmCm;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanhoEmCm) {
        this.tamanho = tamanhoEmCm;
    }

    @Override
    public String toString() {
        return "Caneta{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", tamanho (cm)=" + tamanho +
                '}';
    }
}

class CanetaTeste {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Bic", "Azul", 5);
        Caneta caneta1 = new Caneta("FaberCastell", "Preto", 8);

        System.out.println(caneta);
        System.out.println(caneta1);
    }
}