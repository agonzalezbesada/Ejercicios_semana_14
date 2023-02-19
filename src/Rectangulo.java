public class Rectangulo extends Cuadrilatero implements Forma{

    private double base;

    private double altura;

    Rectangulo() {

    }

    public void dibujar_puntos() {
        System.out.println("Dibuar puntos rectangulo");
    }

    public void rellenar_forma() {
        System.out.println("Rellenar forma rectangulo");
    }

    public double calcular_area() {
        double area = base * altura;
        System.out.println(area);
        return area;
    }

    public double calcular_perimetro() {
        double perimetro = (base * 2) + (altura * 2);
        System.out.println(perimetro);
        return perimetro;
    }
}
