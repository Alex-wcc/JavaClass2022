package generic.Errorr;

import java.util.Collection;

class CollectionGenFoo<T extends Collection> {
    private T x;

    public CollectionGenFoo(T x)  { this.x = x;}
    public T getX()  { return x;}
    public void setX(T x)  { this.x = x;}
}
