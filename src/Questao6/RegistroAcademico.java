package Questao6;

import Questao2.Data;


public class RegistroAcademico {
    private String nomeDoAluno;
    private int numeroDeMatricula;
    private Data dataDeNascimento;
    private boolean eBolsista;
    private int anoDeMatricula;
    private double mensalidade =400;

    public RegistroAcademico(String nomeDoAluno, int numeroDeMatricula, Data dataDeNascimento, boolean eBolsista, int anoDeMatricula) {
        this.nomeDoAluno = nomeDoAluno;
        this.numeroDeMatricula = numeroDeMatricula;
        this.dataDeNascimento = dataDeNascimento;
        this.eBolsista = eBolsista;
        this.anoDeMatricula = anoDeMatricula;
        if (eBolsista){
            this.mensalidade*=0.5;
        }
    }

    public double calculaMensalidade(){
        return mensalidade;
    }

    public String mostraRegistro() {
        return "RegistroAcademico{" +
                "nomeDoAluno='" + nomeDoAluno + '\'' +
                ", numeroDeMatricula=" + numeroDeMatricula +
                ", dataDeNascimento=" + dataDeNascimento +
                ", eBolsista=" + eBolsista +
                ", anoDeMatricula=" + anoDeMatricula +
                ", mensalidade=" + mensalidade +
                '}';
    }
}
