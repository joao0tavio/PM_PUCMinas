package poo_basica.livro;

public class App {
    void main(){
        String titulo = IO.readln("Titulo: ");
        String autor = IO.readln("Autor: ");
        double numeroPag = Integer.parseInt(IO.readln("Qts pag: "));
        int qtdAvaliacoes = Integer.parseInt(IO.readln("Qts avaliacoes: "));
        double tempoPagina = Integer.parseInt(IO.readln("Quantos minutos por pagina: "));

        Livro meuLivro = new Livro(titulo, autor, numeroPag, qtdAvaliacoes, tempoPagina);
        meuLivro.getAvaliacoes();
        IO.println("A média das notas é: "+ meuLivro.media());
        meuLivro.estimativaTempo();
    } 

}
