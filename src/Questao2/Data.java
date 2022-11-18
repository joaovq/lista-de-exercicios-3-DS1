package Questao2;

/*// TODO:
*     Implementar uma classe Data que deve possuir como características
*       os atributos dia, mês e ano (todas do tipo inteiro).
*       Nesta classe, além dos métodos construtores, getters, setters e toString,
*       deverá ser implementado o método validarData (int, int, int): boolean que
*       deverá verificar se as informações passadas por parâmetros é verdadeira ou não.
*       Este método deverá inclusive verificar se é ano bissexto.
*       O método toString deverá retornar uma string no seguinte formato
*       “dia/mês/ano”, como por exemplo “17 de novembro de 2022”.
*
*
*
* */


public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        boolean validarData = validarData(dia, mes, ano);
        if(validarData){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        else {
            System.out.println("Objeto não pode ser criado.");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        String mesPorExtenso;
        switch (mes){
            case 1 -> mesPorExtenso="Janeiro";
            case 2 -> mesPorExtenso="Fevereiro";
            case 3 -> mesPorExtenso="Março";
            case 4 -> mesPorExtenso="Abril";
            case 5 -> mesPorExtenso="Maio";
            case 6 -> mesPorExtenso="Junho";
            case 7 -> mesPorExtenso="Julho";
            case 8 -> mesPorExtenso="Agosto";
            case 9 -> mesPorExtenso="Setembro";
            case 10 -> {
                mesPorExtenso = "Outubro";
            }
            case 11 -> mesPorExtenso="Novembro";
            case 12 -> mesPorExtenso="Dezembro";
            default -> throw new IllegalStateException("Valor atribuito ao mês inválido: " + mes);
        }



        return    dia +
                " de "+ mesPorExtenso.toLowerCase() +
                " de " + ano;
    }


    public static boolean validarData(int dia, int mes, int ano){
        boolean lowerThanZero = ano < 0 | mes < 0 | dia < 0;
        boolean moreThanCapacit = mes > 12 | dia > 31;

//        Verificação se é ano bissexto


        boolean divisivelPor400 = ano % 400 == 0;
        boolean naoDivisivelPor100 = !(ano % 100 == 0);
        boolean divisivelPor4 = ano % 4 == 0;
        boolean eAnoBissexto = divisivelPor4 && naoDivisivelPor100 || divisivelPor400;

//        Termina a verificação

        if (lowerThanZero){
//            throw new IllegalStateException("Valor atribuido as variaveis não pode ser menor que zero:"+dia+"/"+mes+"/"+ano);
            return false;
        } else if (moreThanCapacit) {
//            throw new IllegalStateException("Valor atribuido as variaveis não pode ser maior do que: mês>12 ou dia>31");
            return false;
        }
        else {
            switch (mes){
                case 2 -> {
                    int diasFevereiro = (eAnoBissexto) ? 29: 28;
                    boolean mesDeFevereiro = !(dia > 0 && dia < diasFevereiro);
                    if (mesDeFevereiro){
//                        throw new IllegalStateException("Valor atribuido ao dia do mes " + mes+ " é invalido: dia="+dia);
                        return false;
                    }
                }
                case 4,6,9,11->{
                    boolean mesesAteTrintaDias = dia > 0 && dia <= 30;
                    if (!mesesAteTrintaDias){
//                        throw new IllegalStateException("Valor atribuido ao dia do mes " + mes+ " é invalido: dia="+dia);
                        return false;
                    }
                }
                case 1,3,5,7,8,10,12 -> {
                    boolean mesesAteTrintaUmDias = dia > 0 && dia <= 31;
                    if (!mesesAteTrintaUmDias){
//                        throw new IllegalStateException("Valor atribuido ao dia do mes " + mes+ " é invalido: dia="+dia);
                        return false;
                    }
                }
                default -> throw new IllegalStateException("Valor atribuito ao mês inválido: " + mes);
            }
        }
        return true;
    }
}
