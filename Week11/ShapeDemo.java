package Week11;


/**
 * Write a description of class ShapeDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShapeDemo
{
    

    public static void main(String[] args) {

        // Array of Shape objects (abstraction)
        Shape[] shapes = new Shape[2];

        shapes[0] = new Rectangle(10, 5);
        shapes[1] = new Circle(7);

        for (Shape s : shapes) {
            s.displayShapeInfo();

            // Casting to interface
            if (s instanceof Drawable) {
                ((Drawable) s).draw();
            }

            System.out.println("-------------------");
        }
    }
}

