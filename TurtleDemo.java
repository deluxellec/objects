import java.awt.Color;

/*
 * every java program contains one or more classes (e.g., turtledemo).
 * in general, every source file (e.g., turtledemo.java) contains one class (turtledemo)
 * the source file name must match the class name.
 * by convention, class names starts with an uppercase.
 * 
 */
public class TurtleDemo
{
    /*
     * a class contains methods.
     * most java programs contain a class with a main method.
     * the main method is executed when the program starts.
     */
    public static void main(String[] args)
    {
        /*
         * a statement contains identifiers.
         * identifiers may be any combination of:
         *      letters
         *      digits (but not the first character)
         *      underscores (_)
         *      dollar signs ($) -- rare
         */
        int y, x2, x_y, total$;
        //this is a single-line comment in java (like # in python)
        //this is not a valid identifier
        //int 2y;
        //identifiers are case-sensitive (case matters)
        //these are different indetifiers:
        Turtle daiwa, DAIWA, dAiwa;
        //these are not:
        //Turtle tachyon, tachyon;
        
        /*
         * by convention, constants are all uppercase in java.
         * use an underscore to separate words.
         */
        int SPEED_OF_LIGHT = 300000000; //m/s
        /*
         * by convention, most other identifiers start with a lowercase letter.
         *      subsequent words start with an uppcase (camalcase)
         */
        World pacificOcean;
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        crush.forward(50);
        crush.forward(100);
        crush.turnRight();
        crush.forward(100);
        /*
         * this is a compile-time error. (this code doesn't compile)
         * these are often syntax errors.
         */
        //crush.forda(60);
        /*
         * this is a run-time error. (this code compiles and runs).
         * but generates an exception (i.e., error) in most cases, the program crashes
         */
        //crush.forward(1/0);
        /*
         * this is also a run-time error. (this code compiles and runs).
         * but turns right instead of left. it doesn't produce the expected output.
         * i intended for the turtle to turn left.
         * this is a logical error
         */
        
        
        
        crush.turn(90);
        crush.forward(100);
        Turtle tachyon = new Turtle(ocean);
        Color customColor = new Color(102, 77, 122);
    }
}
