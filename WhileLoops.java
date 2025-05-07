import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber

        while (true) {
            int randomNum = getRandomNumber(10);
            System.out.println("Un numero aleatorio hasta que sea 7: " + randomNum);
            if (randomNum == 7) {
                break;
            }
        }


        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber

        while (true) {
            int randomNum = getRandomNumber(80);
            System.out.println("Un numero aleatorio hasta que sea mayor a 70: " + randomNum);
            if (randomNum >= 70) {
                break;
            }
        }


        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber

        Scanner scanner = new Scanner(System.in);
        int randomNum = getRandomNumber(100);
        System.out.println("Hola, adivina el numero aleatorio entre 1 y 100");
        int intento;
        do {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();
            if (intento < randomNum) {
                System.out.println("El número es mayor que " + intento);
            } else if (intento > randomNum) {
                System.out.println("El número es menor que " + intento);
            }
        } while (intento != randomNum);
        System.out.println("¡Correcto! El número era " + randomNum);
    }


    /**
     * Function name: getRandomNumber
     * 
     * @param number (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){
        return (int)(Math.random() * number) + 1;
    }
}
