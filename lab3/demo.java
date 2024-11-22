package exp_3_3;

class X {
    int i;
    int j;

    public X(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int finalSum() {
        return i + j;
    }
}

class Y extends X {

    public Y(int i, int j) {
        super(i, j);
    }

    public int findProduct() {
        return i * j;
    }
}

class Z extends Y {

    public Z(int i, int j) {
        super(i, j);
    }

    public int findDifference() {
        return i - j;
    }
}

public class demo {
    public static void main(String[] args) {
        Z obj = new Z(4, 7);
        int sum = obj.finalSum();
        int product = obj.findProduct();
        int difference = obj.findDifference();

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
    }
}
