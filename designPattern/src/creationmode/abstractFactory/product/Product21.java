package creationmode.abstractFactory.product;

/**
 * @Program:designPattern
 * @Title: product2
 * @Description: 具体产品2号
 * @Auther: YangCheng
 * @Create 2020/8/3 0003 17:38
 */
public class Product21 implements AbstractProduct {

    public Product21(String name){
        System.out.println(name);
    }

    @Override
    public void show() {
        System.out.println("电器空调产品一号产生完成");
    }
}
