package day0804.interface01;
/**
 * 接口：防盗
 * */
public interface ISecurity {
    void Security();

    public default void show(){}
}
