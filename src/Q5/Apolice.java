package Q5;

import java.util.Scanner;

public class Apolice {

    private String nomeDoSegurado;
    private int idadeDoSegurado;
    private double valorPremio;


    public Apolice(String nomeDoSegurado, int idadeDoSegurado, double valorDoPremio) {
        this.nomeDoSegurado = nomeDoSegurado;
        this.idadeDoSegurado = idadeDoSegurado;
        this.valorPremio = valorDoPremio;
    }

    public void calcularPremioApolice(){
        if (idadeDoSegurado>=18 && idadeDoSegurado<=25){
            valorPremio+=(valorPremio*20)/100;
        } else if (idadeDoSegurado>25 && idadeDoSegurado<=26) {
            valorPremio+=(valorPremio*15)/100;
        } else if (idadeDoSegurado>36) {
            valorPremio+=(valorPremio*10)/100;
        }
        else {
            System.out.println("Não tem valor do prêmio");
        }
    }

    public void oferecerDesconto(String cidade){
        switch (cidade.toUpperCase()){
            case "CURITIBA":
                System.out.println("Você tem desconto de 20%");
                break;
            case "RIO DE JANEIRO":
                System.out.println("Você tem desconto de 15%");
                break;
            case "BELO HORIZONTE":
                System.out.println("Você tem desconto de 5%");
                break;
                case "SÃO PAULO":
                    System.out.println("Você tem desconto de 10%");
                break;
            default:
                System.out.println("Resposta inválida");
                break;
        }
    }

    public void imprimir() {
        System.out.println("Apolice{" +
                "nomeDoSegurado='" + nomeDoSegurado + '\'' +
                ", idadeDoSegurado=" + idadeDoSegurado +
                ", valorDoPremio=" + valorPremio +
                '}');
    }
}

class ApoliceTeste{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Apolice apolice = new Apolice(scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());

        apolice.imprimir();

        apolice.oferecerDesconto("curitiba");

        apolice.calcularPremioApolice();
    }
}