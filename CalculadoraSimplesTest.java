import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculadoraSimplesTest {
    
    @Test
    public void testSomar() {

        // Teste de método de soma
        assertEquals(5, CalculadoraSimples.somar(2, 3));
        assertEquals(-1, CalculadoraSimples.somar(2, -3));
        assertEquals(0, CalculadoraSimples.somar(0, 0));

    }

    @Test 
    public void testSubtrair() {
        
        // Teste de método de subtração
        assertEquals(5, CalculadoraSimples.subtrair(10, 5));
        assertEquals(0, CalculadoraSimples.subtrair(0, 0));
    }

    @Test 
    public void testMultiplicar() {

        // Teste de método da multiplicação
        assertEquals(0, CalculadoraSimples.multiplicar(0, 0));
        assertEquals(15, CalculadoraSimples.multiplicar(3, 5));
    }
    
    @Test 
    public void testDivisao() {

        // Teste de método para divisão 
        assertEquals(0, CalculadoraSimples.dividir(0, 0));
        assertEquals(1, CalculadoraSimples.dividir(1, 0));
        assertEquals(5, CalculadoraSimples.dividir(10, 2));
    }


}
