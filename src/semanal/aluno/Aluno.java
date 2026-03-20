package semanal.aluno;

public class Aluno {
    String nome;
    String matricula;
    double somaAvaliacaoes;
    int qtdAvaliacoes;
    int faltas;
    int totalAulas;


    public Aluno(String nome, String matricula, int totalAulas){
        this.nome = nome;
        this.matricula = matricula;
        somaAvaliacaoes = 0;
        qtdAvaliacoes = 0;
        faltas = 0;
        this.totalAulas = totalAulas;
    }

    public double lancarNota(double nota){
        if(nota >= 0 && qtdAvaliacoes < 4){
            somaAvaliacaoes += nota;
            qtdAvaliacoes ++;
        }
        return somaAvaliacaoes;
    }

    public int lancarFalta(int quantidade){
        if(quantidade > 0)
            faltas += quantidade;
        return faltas;
    }

    public double calcularFrequencia(){
        double presencas = totalAulas - faltas;
        double frequencia = (presencas / totalAulas) * 100;
        return frequencia;
    }

    public double calcularMediaFinal(){
        double mediaFinal = somaAvaliacaoes / qtdAvaliacoes;
        return mediaFinal;
    }

    public boolean avaliarAprovacao(){
        double frequencia = calcularFrequencia();
        double mediaFinal = calcularMediaFinal();
        if(frequencia >= 75 && mediaFinal >= 60)
            return true;
        return false;
    }
}
