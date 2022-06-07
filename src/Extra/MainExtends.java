package Extra;

class Polygon {
    public void display() {
        System.out.println("在 Polygon 类内部");
    }
}

class AnonymousDemoExtends {
    public void createClass() {

        // 创建的匿名类继承了 Polygon 类
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("在匿名类内部。");
            }
        };
        p1.display();
    }
}

public class MainExtends {
    public static void main(String[] args) {
        AnonymousDemoExtends an = new AnonymousDemoExtends();
        an.createClass();
    }
}