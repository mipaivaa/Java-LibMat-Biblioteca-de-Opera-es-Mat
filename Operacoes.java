import java.lang.Math;
public class Operacoes {


	public static double somar(double... numeros) { // O varargs permite fornecer um número variável de argumentos 
        double resultado = 0;
        for (double num : numeros) { // o for percorre todos os números fornecidos como argumentos (numeros) e os adiciona à variável resultado
            resultado += num;
        }
        return resultado;
    }
	
	public static double subtracao(double... numeros) {
		double resultado = numeros[0];  // Inicializa com o primeiro número
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i]; // Subtrai os números restantes
        }
        return resultado;
    }
    

    public static double multiplicar(double... numeros) {
    	double resultado = 1;
        for (double num : numeros) {
            resultado *= num;
        }
        return resultado;
    }
    

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static double calcularAreaQuadrado(double lado) {
    	return lado * lado;
    }

    public static double calcularPerimetroCubo(double lado) {
        return 12 * lado;
    }

    public static double calcularPerimetroCirculo(double raio) {
        return 2 * 3.14 * raio;
    }
    
    public static double calcularVolumeCubo(double lado) {
    	return lado * lado * lado;
    }
    
    public static double calcularJurosSimples(double capital, double taxa, double tempo) {
        return capital * taxa * tempo;
    }

    public static double calcularJurosCompostos(double capital, double taxa, double tempo) {
        return capital * Math.pow(1 + taxa, tempo) - capital;
    }
}

//Atender pedidos de operações
//aritméticas básicas (Soma, subtração,
//multiplicação e divisão), Cálculos de área,
//perímetro e volume,