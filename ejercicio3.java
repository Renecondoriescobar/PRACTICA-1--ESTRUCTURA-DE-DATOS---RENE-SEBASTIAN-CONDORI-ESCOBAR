import java.util.Scanner;


public class ejercicio3 {
    //definimos el vector notas
    int []notas;

    Scanner scanner;


    //metodo constructor
    public ejercicio3() {
        notas = new int[5];

        scanner = new Scanner(System.in);
    }

    //metodo ejecutar
    public void ejecutar(){
        //ingresando por teclado notas (0-10)
        for (int i = 0; i < notas.length ; i++) {
            System.out.println("notas [" + i + "]: ");
            int nota = scanner.nextInt();

            notas[i] = nota;
        }

        //mostramos el contenido de notas
        double suma = 0;
        double promedio;

        int minimo = 10;
        int maximo = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas[" + i + "]: " + notas[i]);

            suma = suma + notas[i];

            if(notas[i] < minimo) {
                minimo = notas[i];
            }

            if(notas[i] > maximo) {
                maximo = notas[i];
            }
        }

        promedio = suma / notas.length;

        System.out.println("Promedio:" + promedio);
        System.out.println("Maximo:" + maximo);
        System.out.println("Minimo:" + minimo);


    }

}
