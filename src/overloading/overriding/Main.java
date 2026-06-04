package overloading.overriding;

public class Main {
    public static void main(String[] args) {
        System.out.println("- Polimorfismo: Sobrecarga y Sobrescritura -");
        
        Notification notificacion = new Notification("La fecha de entrega del proyecto se acerca");
        
        System.out.println("-> Demostración de Sobrecarga:");
        notificacion.enviar();
        notificacion.enviar("Salvador");
        notificacion.enviar("Salvador", "alta");
        
        System.out.println();
        
        System.out.println("-> Demostración de Sobrescritura:");
        EmailNotification correo = new EmailNotification("Tu repositorio ha sido actualizado con éxito");
        correo.enviar();
    }
}