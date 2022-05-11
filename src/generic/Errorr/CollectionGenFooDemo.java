package generic.Errorr;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionGenFooDemo {
    public static void main(String args[]){
        CollectionGenFoo<ArrayList> listfoo= null;
        listfoo = new CollectionGenFoo<ArrayList>(new ArrayList());

        CollectionGenFoo<Collection> listfoo2 = null;
        //listfoo2= new CollectionGenFoo<ArrayList>(new ArrayList());
    }
}
