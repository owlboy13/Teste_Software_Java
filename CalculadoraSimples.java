public class CalculadoraSimples {
    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static int dividir(int a, int b){
        if (b == 0 || a == 0){
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return a / b;
    }
}

