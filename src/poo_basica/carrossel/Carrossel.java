package poo_basica.carrossel;

public class Carrossel {
    boolean ligado;
    int velocidade; 
    int capacidade;
    int ocupacao;

    void setUp(int capacidade){
		ligado = false;
		velocidade = 0;
		if(capacidade <= 0)
			capacidade = 25;
		this.capacidade = capacidade; 
		ocupacao = 0;
	}

	public Carrossel(){
		setUp(25);
	}

	public Carrossel(int capacidade){
		setUp(capacidade);
	}

    public boolean ligar(){
        if(!ligado){
            ligado = true;
            alterarVelocidade(1);
        } 
        return ligado;
    }

    public boolean desligar(){
        if(ligado){
			alterarVelocidade(velocidade-1);
			if(velocidade == 0)
				ligado = false;
		}
		return ligado;
    }

    public int alterarVelocidade(int velocidade){
        if(ligado){
            if(this.velocidade - velocidade == 1 || this.velocidade - velocidade == -1)
                this.velocidade = velocidade;
        }
        return this.velocidade;
    }

    public int embarcar(int qtd){
        if(ocupacao + qtd > capacidade)
            return ocupacao;

        ocupacao += qtd;
        return ocupacao;
    }

    public int desembarcar(int qtd){
        if(ocupacao - qtd < 0)
            return ocupacao;

        ocupacao -= qtd;
        return ocupacao;
    }
}
