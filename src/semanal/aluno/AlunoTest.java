package semanal.aluno;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AlunoTest {
    @Test
    public void testAlunoAprovado() {
        //Arrange
        Aluno aluno = new Aluno("João Otávio", "12345", 40);
        
        //Act
        aluno.lancarFalta(4);    
        aluno.lancarNota(70.0);
        aluno.lancarNota(70.0);
        
        //Assert
        assertTrue(aluno.avaliarAprovacao());
    }

    @Test
    public void testAlunoNaoAprovadoPorMedia() {
        //Arrange
        Aluno aluno = new Aluno("Júlia Pereira", "98765", 40);
        
        //Act
        aluno.lancarFalta(0);
        aluno.lancarNota(40.0);
        aluno.lancarNota(40.0);
        
        //Assert
        assertFalse(aluno.avaliarAprovacao());
    }
}
