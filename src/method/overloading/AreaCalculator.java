package method.overloading;

public class AreaCalculator {

    public double calcularArea(double lado) {
        return lado * lado;
    }

    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    public double calcularArea(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {

    }
}