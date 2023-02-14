import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);


        System.out.println("Elija una figura"+"\n"+"1. Cuadrado"+"\n"+"2. Rectángulo"+"\n"+"3. Triángulo"+"\n"+"0. SALIR");
        int eleccion = guardar.nextInt();

        switch (eleccion) {

            case 1:
                Punto p1 = new Punto(3, 3);
                Punto p2 = new Punto(3, 3);
                Punto p3 = new Punto(3, 3);
                Punto p4 = new Punto(3, 3);
                Cuadrado cuadrado1 = new Cuadrado();
                break;

            case 2:


                break;


            case 3:


                break;


            default:


        }



    }
}
