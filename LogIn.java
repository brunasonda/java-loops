import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, escribe un bucle que siga ejecutándose y devuelva 'Datos incorrectos por favor vuelve a intentar' mientras el nombre de usuario o la contraseña sean incorrectos.
        //Cuando el usuario y la constraseña sean correctos imprime en terminal: ¡Acceso concedido!
        //String correctUsername = "Pepita";
        //String correctPassword = "pepi123";

        String correctUsername = "Pepita";
        String correctPassword = "pepi123";

        Scanner input = new Scanner(System.in);
        String tryUsername;
        String tryPassword;
        while (true) {
            System.out.println("Ingresa tu nombre del usuario: ");
            tryUsername = input.nextLine();
            System.out.println("Ingressa tu contraseña: ");
            tryPassword = input.nextLine();
            if (tryUsername.equals(correctUsername) &&
                    tryPassword.equals(correctPassword)) {
                System.out.println("¡Acceso concedido!");
                break;
            } else {
                System.out.println("Datos incorrectos por favor vuelve a intentar");
            }
        }
    }
}