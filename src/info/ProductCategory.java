package info;

public class ProductCategory {
    /**
     * 1、请使用面向对象的思想设计描述商品信息
     * 1、分析商品类别和商品详细信息的属性和方法，设计商品类别类 和商品详细信息类
     * 2、在商品详细信息类中通过属性描述该商品所属类别
     * 3、设置属性的私有访问权限，通过公有的get，set方法实现对属 性的访问
     * 4、编写测试类，测试商品类别类和商品详细信息类的对象及相关 方法（测试数据信息自定）
     * 5、 创建包info---存放商品类别类和商品详细信息类，创建包 test---存放测试类
     *
     * 参考思路分析：
     * 商品类别类：
     * 属性：类别编号，类别名称
     *
     * 商品详细信息类：
     * 属性：商品编号，商品名称，所属类别、商品数量(大于0)，商品价格(大于0)，
     * 方法：盘点的方法，描述商品信息。内容包括商品名称，商品数量，商品价格，现有商品总价以及所属类别信息
     * */
    private String id;//类别编号
    private String name;//类别名称

    public ProductCategory(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
