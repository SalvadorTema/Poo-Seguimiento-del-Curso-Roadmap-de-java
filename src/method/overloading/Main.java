package method.overloading;

public class Main {
    public static void main(String[] args) {
        System.out.println("- Práctica: Sobrecarga de Métodos Matemáticos -");
        
        AreaCalculator calculadora = new AreaCalculator();
        
        System.out.println("Área de un cuadrado (Lado 7): " + calculadora.calcularArea(7));
        System.out.println("Área de un rectángulo (12x6): " + calculadora.calcularArea(12, 6));
        System.out.println("Área de un trapecio (B:15, b:10, h:8): " + calculadora.calcularArea(15, 10, 8));
        
        double areaC = calculadora.calcularAreaCirculo(5);
        System.out.println("Área de un círculo (Radio 5): " + areaC);
    }
}