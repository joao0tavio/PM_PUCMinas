import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContaTest {

    @Test
    public void testDepositar(){
        // Arrange
        Conta conta = new Conta("123", "1365254", 200);
        conta.depositar(200);
        conta.sacar(100);

        //Act
        double saldo = conta.saldo;
        
        //Assert
        assertEquals(100, saldo, 0.01);
    }

    @Test
    public void testDepositarNegativado(){
        // Arrange
        Conta conta = new Conta("123", "1365254", 100);
        conta.depositar(200);
        conta.sacar(300);
        conta.depositar(200);

        //Act
        double saldo = conta.saldo;
        
        //Assert
        assertEquals(94, saldo, 0.01);
    }


}
