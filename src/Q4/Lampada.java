package Q4;
/*
*
* TODO: Implementar uma classe Lampada que deve possuir como características tipo (led, fluorescente,...), voltagem
*  , cor, marca, preço, potência, status(boolean).
*   Nesta classe devem ser implementados os métodos construtores, getters, setters, toString, ascender e apagar.
*  Em uma outra classe chamada LampadaTeste devem ser criados dois objetos do tipo
*  Lampada, atribuir valores e exibir os dados deste objeto. O programa deverá informar também qual das
*  duas lâmpadas possui maior potência e também qual das lâmpadas é a mais cara.

 *
* */

public class Lampada {

    private String tipo;
    private int voltagem;
    private String cor;
    private String marca;
    private int preco;
    private int potencia;
    private boolean status;

    public Lampada(String tipo, int voltagem, String cor, String marca, int preco, int potencia, boolean status) {
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "tipo='" + tipo + '\'' +
                ", voltagem=" + voltagem +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", preco='" + preco + '\'' +
                ", potencia=" + potencia +
                ", status=" + status +
                '}';
    }
    public void acender(){
        if (status)
            System.out.println("Luz acesa");
        else{
            System.out.println("Luz apagada");
            System.out.println("Ligando...");
            status=true;
        }
    }
    public void apagar(){
        if (!status)
            System.out.println("Luz apagada");
        else{
            System.out.println("Apagando...");
            status=true;
            System.out.println("Apagada!");
        }
    }
}
class LampadaTeste {
    public static void main(String[] args) {
        Lampada lampada = new Lampada("led",
                127,
                "branca",
                "flutclolo",
                20,
                90,
                true);
        Lampada lampada2 = new Lampada("fluorescente",
                220,
                "branca",
                "Luzgrate",
                28,
                110,
                false);


        System.out.println(lampada);
        System.out.println(lampada2);

        boolean maiorPreco = lampada.getPreco() > lampada2.getPreco();
        boolean maiorPotencia = lampada.getPotencia() > lampada2.getPotencia();

        if (maiorPreco)
            System.out.println(lampada+" é mais cara que "+lampada.getPreco());
        else
            System.out.println(lampada2+" é mais cara que "+lampada2.getPreco());

        if (maiorPotencia)
            System.out.println(lampada+" tem a maior potencia com "+lampada.getPreco());
        else
            System.out.println(lampada2+" tem a maior potencia com "+lampada2.getPreco());

    }
}