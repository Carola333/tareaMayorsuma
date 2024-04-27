import java.util.Scanner;
public class App {
    


    // Michelle Carolina Montalban perez 2024-1382U Grupo 1M1
    public static int num1;
    public static int num2;
    public static int num3;

    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

       // solicitar 3  numeros diferentes 
        do {

            try {
                System.out.println("Ingrese tres numeros enteros diferentes");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                num3 = leer.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
            }

        } while (num1 == num2 || num1 == num3 || num2 == num3);
        // Calculo de la suma de dos numeros pequeños
        int sumaDosmenores = num1+num2+num3-Math.max(Math.max(num1, num2), num3);
        // Calculo de la diferencia de dos numeros mayores
        int diferenciaDosmayores = Math.max(Math.max(num1, num2), num3)-Math.max(Math.min(num1, num2), Math.min(Math.max(num1, num2), num3));
        //  numero mayor
        int mayor= Math.max(Math.max(num1, num2), num3);
        
        System.out.println("La suma de los dos numeros pequeños es:"+sumaDosmenores);
        System.out.println("La diferencia de los dos numeros mayores es:"+diferenciaDosmayores);
        System.out.println("El numero mayor es:"+mayor);
    
    }

}