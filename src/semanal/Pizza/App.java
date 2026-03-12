package semanal.Pizza;
public class App {
    void main(){
        Pizza pizzaTeste = new Pizza();
        int qtd = Integer.parseInt(IO.readln("Digite quantos ingredientes deseja adicionar: "));
        pizzaTeste.adicionarIngredientes(qtd);
        IO.println(pizzaTeste.cupomDeVenda());
    }
}
