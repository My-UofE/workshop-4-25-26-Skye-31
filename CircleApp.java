public class CircleApp {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0, 0.0, 0.0);
        Circle c2 = new Circle(3.0, 4.0, 0.0);
        Circle c3 = new Circle(2.0, 10.0, 10.0);
        Circle c4 = new Circle(2.0, 0.0, 0.0);

        System.out.println("C1: " + c1);
        System.out.println("C2: " + c2);
        System.out.println("C3: " + c3);
        System.out.println("C4: " + c4);

        System.out.println("\nmeasurements:");
        System.out.println("c1 area: " + c1.getArea());
        System.out.println("c1 circumference: " + c1.getCircumference());

        System.out.println("\nsetters and protection:");
        c1.setRadius(-10.0);
        System.out.println("C1 radius after set -10: " + c1.getRadius());
        c1.setOriginX(5.0);
        c1.setOriginY(5.0);
        System.out.println("C1 after set origin: " + c1);

        System.out.println("\nscaling and movement:");
        c3.scale(2.0);
        c3.move(-2.0, -2.0);
        System.out.println("C3: " + c3);

        System.out.println("\noverlap:");
        Circle testA = new Circle(5.0, 0.0, 0.0);
        Circle testB = new Circle(5.0, 8.0, 0.0);
        Circle testC = new Circle(5.0, 12.0, 0.0);
        
        System.out.println("a overlaps b " + testA.isOverlappedWith(testB));
        System.out.println("a overlaps c: " + testA.isOverlappedWith(testC));

        System.out.println("\nenclosure:");
        System.out.println("C4 enclosed by C1: " + c4.isEnclosedBy(c1));
        System.out.println("C1 enclosed by C4: " + c1.isEnclosedBy(c4));
    }
}