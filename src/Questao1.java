/*TODO:
    Escreva um programa que retorne o número do quadrante (1,2,3 ou 4)
    através de um método chamado VERIFICA_QUADRANTE,
    que deve receber um valor para x e um valor para y.
*
*
*
* */

public class Questao1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int quadrante = verificaQuadrante(1, 1);

        System.out.println("Está no "+quadrante+" quadrante");
    }

    public static int verificaQuadrante(int posicaoEixoX , int posicaoEixoY){

        if (posicaoEixoX<0 && posicaoEixoY>0){
            return 1;
        }else if (posicaoEixoX>0 && posicaoEixoY>0){
            return 2;
        } else if (posicaoEixoX<0 && posicaoEixoY<0){
            return 3;
        }
        else if (posicaoEixoX>0 && posicaoEixoY<0){
            return 4;
        }
            System.out.println("Está em um dos eixos");
            return 0;

    }
}