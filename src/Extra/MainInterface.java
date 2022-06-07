package Extra;

interface PolygonInterface {
    public void display();
}

class AnonymousDemoInterface {
    public void createClass() {

        // 匿名类实现一个接口
        PolygonInterface p1 = new PolygonInterface() {
            public void display() {
                System.out.println("在匿名类内部。");
            }
        };
        p1.display();
    }
}

public class MainInterface {
    public static void main(String[] args) {
        AnonymousDemoInterface an = new AnonymousDemoInterface();
        an.createClass();
    }
}