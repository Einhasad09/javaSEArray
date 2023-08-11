package day0803.duotai;

public class Master {
    private  String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal animal,Food food){
        /**
         * 这个name属性编译的时候看左边，运行的时候看右边
         * 右边就是用户输入的动物名字属性
         * ——————————————————————————————
         *我的理解：
         * animal相当于是一个大列表（父类有许多子类）
         * 然后调用feed的时候再传过来一个具体的类
         * 具体的类跟animal这个大列表里的类 对应  确定一个唯一的类
         * 这个类在这个例子里就是cat和food
         * 然后cat和food里还有属性和方法
         * 这样就不用写重复的/重载的代码
         * 提高可读性和维护性
         * ——————————————————————————————
         * animal假设成一个爹拿着三张照片，思考这件事情让哪个儿子做
         * 思考的时候大儿子走进来了
         * 于是他爹把二儿子跟小儿子的照片扔一边去了
         * 说：“就你来干这个事”
         *———————————————————————————————
         * animal的编译类型是Animal 所以animal可以指向Cat和Dog(Animal子类的对象)
         * */
        System.out.println("主人"+ name + "给"+animal.getName()+"吃"+food.getName());
    }
}
