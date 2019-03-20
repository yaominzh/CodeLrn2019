import java.lang.reflect.*;

class Invoke {
    public static void main( String [] args){
        try{
            Class clas = Class.forName( args[0]);
            Method method = clas.getMethod( args[1]);
            Object ret = method.invoke(null);
            System.out.println("Invode static method:" + args[1]
            + " of class: " + args[0]
            + " with no args\nResults: " + ret );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            System.out.println("Method threw an " + e.getTargetException());
        }
    }
}
