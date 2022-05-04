package Collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        // 创建集合对象
        List list = new ArrayList();

        // 测试功能
        list.add("hello");
        list.add("world");
        list.add("java");

        // get(int index)
        // System.out.println(list.get(0));
        // System.out.println(list.get(1));
        // System.out.println(list.get(2));
        // System.out.println(list.get(3)); // IndexOutOfBoundsException

        for (int x = 2; x>-1; x--) {//采用for循环遍历，根据索引访问对象。
            // System.out.println(list.get(x));
            String s = (String) list.get(x);
            System.out.println(s);
        }
    }


}
