public class Cuadrado extends Cuadrilatero implements Forma{

    private double lado;

    Cuadrado() {

    }

    public void dibujar_puntos() {

    }

    public void rellenar_forma() {

    }

    public double calcular_area() {
        double area = lado * lado;
        System.out.println(area);
        return area;
    }

    public double calcular_perimetro() {
        double perimetro = 0d;

        return perimetro;
    }

}