package semanal.Pizza;

public class Pizza {
    int maxIngredientes = 8;
    double precoBase = 29d;
    String descricao;
    double valorAdicional = 5d;
    int qtdIngredientes;
    
    public Pizza(){
        qtdIngredientes = 0;
    }

    public void adicionarIngredientes(int qtd){
        if(qtd <= maxIngredientes){
            qtdIngredientes = qtd;
        }
    }

    public double valorAPagar(){
        return precoBase + (qtdIngredientes * valorAdicional);
    }

    public String cupomDeVenda(){
        return descricao = "Pizza com %d ingredientes: R$%.2f ".formatted(qtdIngredientes, valorAPagar());
    }
}