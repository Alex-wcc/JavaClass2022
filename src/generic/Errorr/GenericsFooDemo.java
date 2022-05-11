package generic.Errorr;

public class GenericsFooDemo {
    public static void main(String [] args) {
     GenericsFoo<String> strFoo = new GenericsFoo<String>("Hello Generics !");
     GenericsFoo<Double> douFoo=new GenericsFoo<Double>(new Double("33"));
     GenericsFoo<Object> objFoo=new  GenericsFoo<Object>(new Object());
     GenericsFoo<Integer> intFoo=new  GenericsFoo<Integer>(new Integer(11));
     
    System.out.println("strFoo.getX"+strFoo.getX()); 
    System.out.println("douFoo.getX"+douFoo.getX()); 
    System.out.println("objFoo.getX"+objFoo.getX());
    System.out.println("intFoo.getX"+intFoo.getX());
    }
}
