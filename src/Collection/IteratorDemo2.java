package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorDemo2 {


    public static void main(String[] args) {
        // 创建集合对象
        List list = new ArrayList();

        // 创建学生对象
        StudentIterator s1 = new StudentIterator("潘金莲", 18);
        StudentIterator s2 = new StudentIterator("孙二娘", 19);
        StudentIterator s3 = new StudentIterator("扈三娘", 20);
        StudentIterator s4 = new StudentIterator("李师师", 21);

        // 把元素添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        // 遍历集合
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StudentIterator s =  (StudentIterator) it.next();
            System.out.println(s.getName() + "---" + s.getAge());
            //错误写法：
            //System.out.println(((StudentIterator)it.next()).getName()+"---"+((StudentIterator)it.next()).getAge());
        }
    }


}
