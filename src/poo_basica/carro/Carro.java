package poo_basica.carro;

public class Carro {
    String placa;
    int velocidadeAtual;
    int velocidadeMaxima = 120;

    public Carro(String placa, int velocidadeAtual){
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int km){
        if((velocidadeAtual + km) >= velocidadeMaxima){
            IO.println("Velocidade max ultrapassada!");
        }
        velocidadeAtual += km;
    }
    
    public void frear(int km){
        velocidadeAtual -= km;
    }

    public void exibir(){
        IO.println("Velocidade atual: "+velocidadeAtual);
    }
    
}
