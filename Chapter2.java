import java.awt.Color;

public class Chapter2
{
    public static void drawLine()
    {
        /*
         * objects are entities in a program.
         * objects have attributes.
         * objects are manipulated by methods.
         * 
         * in the following lines, "ocean" and "orfevre" are variables referencing objects.
         * 
         * classes describe a collection of objects. (a template for creating objects)
         * all objects of a class have the same behaviors  (methods).
         * and they have the same types of attributes (but may have different values for the attributes).
         * 
         * "world" and "turtle" are classes.
         */
        
        World ocean = new World();
        
        /*
         * we use the new operator to construct an object (i.e., create, instantiate).
         * 
         * the class of the object we are creating comes right after the new operator (e.g., turtle).
         * 
         * if we need to pass additional information to the class constructor, we may pass arguments inside the parentheses (e.g., ocean).
         */
        
        Turtle orfevre = new Turtle(ocean);
        
        /*
         * variables store values to use later.
         * variables have a type (e.g., int, turtle)
         * a name (e.g., width, crush)
         * a value (e.g., 20, 2.2, ???)
         */
        
        int width; // declaring a variable
        width = 20; // assigning a value to a variable
        int xPosition = 60; // declaring and assigning in one line
        
        System.out.println("width variable stores the value " + width);
        
        /*
         * java has several primitive data types:
         * - boolean holds a value of true or false
         * - int holds an integer number
         * - double holds a real number (floating point, decimal)
         * - char holds a single character
         */
        
        // here is boolean
        boolean isSummer = true;
        
        //here is a double
        double salesTaxRate = 0.0775;
        
        // here is a char
        char letter = 'c';
        
        /*
         * when invoking methods, we use the dot operator (i.e., '.') to invoke a methodon an object.
         * some methods take no arguments, but we still need the parentheses (e.g., penDown).
         * some methods take one or more arguments (e.g., forward).
         * multiple arguments are seperated by commas.
         * mutator methods modify the state of an object. (e.g., the values of the attributes change)
         * e.g., forward, penDown, setPenColor
         */
        
        orfevre.penDown();
        orfevre.forward(100);
        orfevre.setPenColor(Color.RED);
        orfevre.forward(100);
        
        /*
         * accessor methods return the value of an attribute of the object
         * the state of the object does not change
         * 
         * getPenWidth() is an example of an accessor
         */
        
        int penWidth = orfevre.getPenWidth();
        System.out.println("the current penwidth is: " + penWidth);
    }
}