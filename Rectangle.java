// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  public Rectangle() {
    this(1, 1, 0, 0);
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	  this.originX += dx;
	  this.originY += dy;
  }

  public void scale(double factor) {
    this.width *= factor;
    this.height *= factor;
  }

  public void scale(double factorX, double factorY) {
    this.width *= factorX;
    this.height *= factorY;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return this.width * this.height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (this.width + this.height);
  }

  public boolean isOverlappedWith(Rectangle r){
    if (this.originX + this.width <= r.originX || r.originX + r.width <= this.originX) {
      return false;
    }

    if (this.originY + this.height <= r.originY || r.originY + r.height <= this.originY) {
      return false;
    }

    return true;
  }

  public static boolean areOverlapping(Rectangle r1, Rectangle r2) {
    return r1.isOverlappedWith(r2);
  }
  
  public double calcRatio() {
    return this.width / this.height
  }

  public boolean isSquare() {
    double epsilon = 1e-4;
    return Math.abs(this.height - this.width) < epsilon;
  }
}
