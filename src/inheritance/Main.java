package inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Ejercicio de Herencia en Java ");
        
        Developer developer = new Developer("Salvador", 3500.00, "Java");
        
        developer.showDeveloperInformation();
        developer.work();
        developer.code();
    }
}	