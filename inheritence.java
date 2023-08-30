import java.util.Scanner;

class shape {
    int leng;
    int breadth;

    shape() {
        System.out.println("shape constructor executed");
    }

    void inpval(int len, int bre) {
        leng = len;
        breadth = bre;
    }

    void printinfo() {
        System.out.println("length is: " + leng);
        System.out.println("breadth is: " + breadth);
    }
}

class triangle extends shape {
    triangle() {
        System.out.println("triangle class constructor run");
    }

    void printarea() {
        int area = leng * breadth / 2; // Calculate area without creating a new shape object
        System.out.println("Area of triangle is " + area);
    }
}

class square extends shape {
    square() {
        System.out.println("square class constructor run");
    }

    void printarea() { 
        int area = leng * breadth; // Calculate area without creating a new shape object
        System.out.println("Area of square is " + area);
    }
}

public class inheritence {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter length:");
        int l = obj.nextInt();

        System.out.println("Enter breadth:");
        int b = obj.nextInt();

        square sq = new square();
        sq.inpval(l, b);
        sq.printinfo();
        sq.printarea();

        triangle t = new triangle();
        t.inpval(l, b);
        t.printinfo();
        t.printarea();

        obj.close(); // Close the scanner when done using it
    }
}
