package poo_basica.aluno;
public class Aluno {
    String nome;
    String matricula;
    int qtdAvaliacoes;
    double somaNotas;
    boolean fezReavaliacao;
    double notaReavaliacao;

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
        qtdAvaliacoes = 0;
        somaNotas = 0;
        fezReavaliacao = false;
  
    }

    public double registrarAvaliacao(int nota){
        if(nota >= 0 && nota <= 10){
            somaNotas += nota;
            qtdAvaliacoes ++;
        }
        return somaNotas; 
    }

    public double fazerReavaliacao(double nota) {
        fezReavaliacao = true;
        if(nota >= 0 && nota <= 10)
            notaReavaliacao = nota;
        return notaReavaliacao; 
    }

    public double notaFinal(){
        if(qtdAvaliacoes == 0) 
            return 0;
        double media = somaNotas / qtdAvaliacoes;
        if(fezReavaliacao){
            return (media + notaReavaliacao) / 2;
        }

        return media;
    }

    public String obterSituacao() {
        double notaFinal = notaFinal();
        
        if (notaFinal >= 6) {
            return "Aprovado";
        }

        if (notaFinal >= 4) {
            return "Em Reavaliação";
        }

        return "Reprovado";
    }

}
