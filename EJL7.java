import java.lang.Math;

class Punto3D {
    private double x;
    private double y;
    private double z;

    // Constructores sobrecargados 
    public Punto3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Punto3D(Punto3D punto) {
        this.x = punto.getX();
        this.y = punto.getY();
        this.z = punto.getZ();
    }

    // metodos set y get
    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return this.x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return this.y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return this.z;
    }

    // Metodo para calcular la distancia entre dos puntos
    public double distancia(Punto3D otro_punto) {
        double dx = this.x - otro_punto.getX();
        double dy = this.y - otro_punto.getY();
        double dz = this.z - otro_punto.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}

public class Main {
    public static void main(String[] args) {
        
        //Arreglo de Puntos
        Punto3D[] puntos = new Punto3D[10];
        puntos[0] = new Punto3D(1, 2, 3);
        puntos[1] = new Punto3D(4, 5, 6);
        puntos[2] = new Punto3D(7, 8, 9);
        puntos[3] = new Punto3D(2, 2, 3);
        puntos[4] = new Punto3D(4, 7, 6);
        puntos[5] = new Punto3D(7, 9, 9);
        puntos[6] = new Punto3D(1, 4, 3);
        puntos[7] = new Punto3D(9, 7, 6);
        puntos[8] = new Punto3D(7, 5, 9);
        puntos[9] = new Punto3D(6, 4, 7);
     
        
        //Se calcula la distancia entre los puntos y se determina la distancia minima
        
        double distancia_min = Double.POSITIVE_INFINITY;

        for (int i = 0; i < puntos.length; i++) {
            for (int j = i + 1; j < puntos.length; j++) {
                double distancia = puntos[i].distancia(puntos[j]);
                System.out.println("Distancia entre el punto " + i + " y el punto " + j + " es: " + distancia);
                if (distancia < distancia_min) {
                    distancia_min = distancia;
                }
            }
        }

        System.out.println("La distancia minima es: " + distancia_min);
    }
}
