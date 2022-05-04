package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        // 创建集合对象
        Collection c = new ArrayList();


        c.add("hello");
        c.add("world");
        c.add("java");

        Iterator it = c.iterator();//Iterator的使用，Collection中包含成员方法 Iterator iterator(),并返回。

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("size:" + c.size());

        System.out.println("c:" + c);
    }

}
