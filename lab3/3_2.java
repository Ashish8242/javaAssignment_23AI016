package exp_3_2;

abstract class Figure {
    double pi = Math.PI;
    double a;
    double v;
    double r;

    public Figure(double r) {
        this.r = r;
    }

    public abstract void calcArea();

    public abstract void calcVol();

    public abstract void dispArea();

    public abstract void dispVol();
}

class Cone extends Figure {
    private double n;
    private double s;

    public Cone(double r, double s, double n) {
        super(r);
        this.n = n;
        this.s = s;
    }

    public void calcArea() {
        a = pi * r * s + pi * r * r;
    }

    public void calcVol() {
        v = (pi * r * s) / 3;
    }

    public void dispArea() {
        System.out.println("The area of the cone is " + a);
    }

    public void dispVol() {
        System.out.println("The volume of the cone is " + v);
    }
}

class Sphere extends Figure {
    public Sphere(double r) {
        super(r);
    }

    public void calcArea() {
        a = 4 * pi * r * r;
    }

    public void calcVol() {
        v = (4 * pi * r * r * r) / 3;
    }

    public void dispArea() {
        System.out.println("The area of the sphere is " + a);
    }

    public void dispVol() {
        System.out.println("The volume of the sphere is " + v);
    }
}

class Cylinder extends Figure {
    private double h;

    public Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    public void calcArea() {
        a = 2 * pi * r * h + 2 * pi * r * r;
    }

    public void calcVol() {
        v = pi * r * r * h;
    }

    public void dispArea() {
        System.out.println("The area of the cylinder is " + a);
    }

    public void dispVol() {
        System.out.println("The volume of the cylinder is " + v);
    }
}

public class demo {
    public static void main(String[] args) {
        Cone cone = new Cone(5, 4, 6);
        cone.calcArea();
        cone.calcVol();
        cone.dispArea();
        cone.dispVol();

        Sphere sphere = new Sphere(5);
        sphere.calcArea();
        sphere.calcVol();
        sphere.dispArea();
        sphere.dispVol();

        Cylinder cylinder = new Cylinder(5, 6);
        cylinder.calcArea();
        cylinder.calcVol();
        cylinder.dispArea();
        cylinder.dispVol();
    }
}
