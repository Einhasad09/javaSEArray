package homework0802;

public class Book {
    /**
     * 1、以面向对象的思想，编写自定义类描述图书信息。
     * 2、设置属性的私有访问权限，通过公有的get，set方法实现对属性的访问
     * 3、限定价格必须大于10，如果无效需进行提示
     * 4、限定作者、书名均为只读属性
     * 5、设计构造函数实现对属性赋值
     * 6、信息介绍方法描述图书所有信息
     * 7、 编写测试类，测试图书类的对象及相关方法（测试数据信息自定）
     *
     * 参考思路分析：
     * 图书信息类：
     * 属性包括：书名，作者，出版社名，价格；
     * 方法包括：信息介绍
     * */

    private final String bookName;
    private final String author;
    private String publishingHouse;
    private double price;

    public Book(String bookName, String author, String publishingHouse, double price) {
        this.bookName = bookName;
        this.author = author;
        setPublishingHouse(publishingHouse);
        setPrice(price);
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>10){
            this.price = price;
        }else{
            this.price = 10;
        }

    }

    public void showInfo(){
        System.out.println("书名："+getBookName());
        System.out.println("作者："+getAuthor());
        System.out.println("出版社："+getPublishingHouse());
        System.out.println("价格："+getPrice()+"元");
    }
}
