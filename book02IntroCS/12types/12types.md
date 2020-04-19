```java
//121
public class Ruler { 
    public static void main(String[] args) { 
        String ruler1 = " 1 ";
        String ruler2 = ruler1 + "2" + ruler1;
        String ruler3 = ruler2 + "3" + ruler2;
        String ruler4 = ruler3 + "4" + ruler3;
        String ruler5 = ruler4 + "5" + ruler4;

        System.out.println(ruler1);
        System.out.println(ruler2);
        System.out.println(ruler3);
        System.out.println(ruler4);
        System.out.println(ruler5);
    }

}
//122
public class IntOps { 

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum  = a + b;
        int prod = a * b;
        int quot = a / b;
        int rem  = a % b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);
        System.out.println(a + " = " + quot + " * " + b + " + " + rem);
    }
}
//123
public class Quadratic { 

    public static void main(String[] args) { 
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        double discriminant = b*b - 4.0*c;
        double sqroot =  Math.sqrt(discriminant);

        double root1 = (-b + sqroot) / 2.0;
        double root2 = (-b - sqroot) / 2.0;

        System.out.println(root1);
        System.out.println(root2);
    }
}

//124
public class LeapYear { 
    public static void main(String[] args) { 
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear;

        // divisible by 4
        isLeapYear = (year % 4 == 0);

        // divisible by 4 and not 100
        isLeapYear = isLeapYear && (year % 100 != 0);

        // divisible by 4 and not 100 unless divisible by 400
        isLeapYear = isLeapYear || (year % 400 == 0);

        System.out.println(isLeapYear);
    }
}
//125
public class RandomInt { 
    public static void main(String[] args) { 
        // a positive integer
        int n = Integer.parseInt(args[0]);
        // a pseudo-random real between 0.0 and 1.0
        double r = Math.random(); 
        // a pseudo-random integer between 0 and n-1
        int value = (int) (r * n);
        System.out.println(value);
    }
}
```