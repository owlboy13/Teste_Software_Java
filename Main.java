import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main{
    public static void main(String[] args){
        // Testando o método somar diretamente
        CalculadoraSimples c1 = new CalculadoraSimples();
        System.out.println("Resultado da Soma:" + c1.somar(10,2));

        // Testando o método subtrair diretamente
        CalculadoraSimples c2 = new CalculadoraSimples();
        System.out.println("Resultado da subtração:" + c2.subtrair(7, 2));

        // Testando o método multiplicar diretamente
        CalculadoraSimples c3 = new CalculadoraSimples();
        System.out.println("Resultado da Multiplicação:" + c3.multiplicar(10, 2));

        // Testando o método dividir diretamente
        CalculadoraSimples c4 = new CalculadoraSimples();
        System.out.println("Resultado da Divisão:" + c4.dividir(10, 2));

        // Executando os testes JUnit programaticamente
        Result resultado = JUnitCore.runClasses(CalculadoraSimplesTest.class);

        // Verificando os resultados
        if (resultado.wasSuccessful()) {
            System.out.println("\n Todos os testes passaram com sucesso!");
        } else {
            System.out.println("\n Alguns testes falharam:");
            for (Failure falha : resultado.getFailures()) {
                System.out.println(falha.toString());
            }
        }
    
        System.out.println("Total de testes: " + resultado.getRunCount());
        System.out.println("Falhas: " + resultado.getFailureCount());


    }
}


