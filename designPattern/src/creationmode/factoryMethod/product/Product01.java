package creationmode.factoryMethod.product;

/**
 * @Program:designPattern
 * @Title: Product01
 * @Description: 具体产品一号
 * @Auther: YangCheng
 * @Create 2020/8/3 0003 10:06
 */
public class Product01 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品一号创建完成");
    }
}
