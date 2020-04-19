```java
//131flip
public class Flip {

    public static void main(String[] args) { 

        // Math.random() returns a value between 0.0 and 1.0
        // so it is heads or tails 50% of the time
        if (Math.random() < 0.5) System.out.println("Heads");
        else                     System.out.println("Tails");
    }
}

//132first while loop
public class TenHellos { 
    public static void main(String[] args) {

        // print out special cases whose ordinal doesn't end in th
        System.out.println("1st Hello");
        System.out.println("2nd Hello");
        System.out.println("3rd Hello");

        // count from i = 4 to 10
        int i = 4;
        while (i <= 10) {
            System.out.println(i + "th Hello");
            i = i + 1;
        }

    }
}
//133 computing powers of 2
//134 nested loops
//135 harmonic numbers

//136 Newton's method
//137 converting to binary
//138 gambler's ruin simulation
//139 factoring integers
```