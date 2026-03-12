package poo_basica.livro;

public class Livro {
    String titulo;
    String autor;
    double numeroPag;
    int qtdAvaliacoes;
    double tempoPagina;
    double somaAvaliacoes = 0;
    

    Livro(String titulo, String autor, double numeroPag, int qtdAvaliacoes, double tempoPagina){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag; 
        this.qtdAvaliacoes = qtdAvaliacoes;
        this.tempoPagina = tempoPagina;
    }

    public void getAvaliacoes(){
        for(int i = 0; i < qtdAvaliacoes; i++){
            somaAvaliacoes += Double.parseDouble(IO.readln("Digite a avaliaçao "+(i+1)+": ")); 
        }
    }

    public double media(){
        double media = somaAvaliacoes/qtdAvaliacoes;
        return media;
    }

    public void estimativaTempo(){
        double totalTempo = (tempoPagina * numeroPag) / 60;
        System.out.printf("A estimativa de tempo é: %.2f (horas, minutos)", totalTempo);
    }
}
