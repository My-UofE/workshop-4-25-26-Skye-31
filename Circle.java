public class Circle {
    private double radius;
    private double originX;
    private double originY;

    public Circle(double radius, double originX, double originY) {
        setRadius(radius);
        this.originX = originX;
        this.originY = originY;
    }

    public Circle(double radius) {
        this(radius, 0.0, 0.0);
    }

    public Circle() {
        this(1.0, 0.0, 0.0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    public double getOriginX() {
        return this.originX;
    }

    public void setOriginX(double originX) {
        this.originX = originX;
    }

    public double getOriginY() {
        return this.originY;
    }

    public void setOriginY(double originY) {
        this.originY = originY;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public void move(double dx, double dy) {
        this.originX += dx;
        this.originY += dy;
    }

    public void scale(double factor) {
        if (factor >= 0) {
            this.radius *= factor;
        }
    }

    public boolean isOverlappedWith(Circle other) {
        // straight line distance between the two centers
        double distance = Math.hypot(this.originX - other.originX, this.originY - other.originY);
        // distance must be less than the two radii combined to overlap
        return distance < (this.radius + other.radius);
    }

    public boolean isEnclosedBy(Circle other) {
        double distance = Math.hypot(this.originX - other.originX, this.originY - other.originY);
        // distance + this radius must be within other radius to be enclosed
        return (distance + this.radius) <= other.radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + ", x=" + originX + ", y=" + originY + "]";
    }
}