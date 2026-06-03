package access.specifiers;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tema: Access Specifiers");
        
        User usuario1 = new User("Alexander", "Alexander@email.com", "Normal", "200012");
        usuario1.mostrarInformacionGeneral();
        
        System.out.println();
        
        PremiumUser usuario2 = new PremiumUser("Salvador", "Salvador@email.com", "Premium", "sats");
        usuario2.mostrarBeneficios();
    }
}