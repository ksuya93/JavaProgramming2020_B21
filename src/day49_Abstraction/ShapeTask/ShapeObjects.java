package day49_Abstraction.ShapeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(23);
        Rectangle rectangle = new Rectangle(10,20);
        Cube cube = new Cube(15);
        Cylinder cylinder = new Cylinder(2,5);
        Square square = new Square(50);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(cube);
        System.out.println(cylinder);
        System.out.println(square);

        System.out.println(circle.getR());

        System.out.println(rectangle.getW());

        System.out.println("----------------------------------------------");
       // Shape shape1 = circle;
       // Shape shape2 = rectangle;
       // Shape shape3 = cylinder;
       // Shape shape4 = cube;
       // Shape shape5 = square;

        Shape[] shapes = {circle, rectangle, cube, cylinder, square, new Circle(5), new Square(3),
            new Circle(10), new Circle(15)};

        for(Shape eachShape   : shapes) {
            if(eachShape.name.equals("Circle")){
                System.out.println(eachShape);
            }
        }


        System.out.println("---------------------------------------------------------------------");

        ArrayList<Shape> circles = new ArrayList<>();
        circles.addAll( Arrays.asList(shapes)  );
        circles.removeIf( p -> !p.name.equals("Circle"));

        System.out.println(circles.size());
        System.out.println("---------------------------------------------------------------------");

        circles.forEach( p -> { System.out.println(p); }   );

        System.out.println("--------------------------------------------------------------------");
/*
        for(Shape eachShape :  circles){
            if(eachShape.area() > 400){
                System.out.println(eachShape);
            }
        }
*/

        circles.forEach( each -> { if(each.area()> 400) System.out.println(each);   } );  // in lambda: the variable is immutable

        System.out.println("------------------------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));




    }
}
