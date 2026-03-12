package poo_basica.aluno;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class AlunoTest {
    Aluno aluno = new Aluno("Joao", "123");
    @Test 
    public void testAprovacaoDireta(){
        //ARRANGE
        aluno.registrarAvaliacao(8);
        aluno.registrarAvaliacao(7);
        aluno.registrarAvaliacao(9);

        //ACT
        String situacao = aluno.obterSituacao();

        //ASSERT
        
        assertEquals("Aprovado", situacao);
        
    }

    @Test
    public void testEmReavaliacao(){
        //ARRANGE
        aluno.registrarAvaliacao(4);
        aluno.registrarAvaliacao(5);
        aluno.registrarAvaliacao(6);

        //ACT
        String situacao = aluno.obterSituacao();

        //ASSERT
        
        assertEquals("Em Reavaliação", situacao);
        
    }

    @Test
    public void calcularNotaFinal(){
        //ARRANGE
        aluno.registrarAvaliacao(4);
        aluno.registrarAvaliacao(5);
        aluno.registrarAvaliacao(6);

        //ACT
        double notaFinal = aluno.notaFinal();

        //ASSERT
        
        assertEquals(5, notaFinal, 0.01);
        
    }
}
