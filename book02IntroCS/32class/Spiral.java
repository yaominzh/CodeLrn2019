/******************************************************************************
 *  Compilation:  javac Spiral.java
 *  Execution:    java Spiral
 *  Dependencies: Turtle.java
 *
 *  Plots a logarithmic spiral.
 * 
 *  % java Spiral 3 1.0         // equilateral triangle
 *
 *  % java Spiral 3 1.2
 *
 *  % java Spiral 1440 1.00004
 *
 *  % java Spiral 1440 1.0004  // logarithmic spiral
 *
 ******************************************************************************/

public class Spiral {

    public static void main(String[] args) { 
        int n         = Integer.parseInt(args[0]);     // # sides if decay = 1.0
        double decay  = Double.parseDouble(args[1]);   // decay factor

        double angle  = 360.0 / n;
        double step   = Math.sin(Math.toRadians(angle/2.0));
        Turtle turtle = new Turtle(0.5, 0.0, angle/2.0);
        for (int i = 0; i < 10*n; i++) {
            step /= decay; 
            turtle.goForward(step);
            turtle.turnLeft(angle);
        }

    }
} 
