package creationmode.abstractFactory.product;

/**
 * @Program:designPattern
 * @Title: abstractProduct
 * @Description: 具体产品1号
 * @Auther: YangCheng
 * @Create 2020/8/3 0003 17:31
 */
public class Product11 implements AbstractProduct {

    public Product11(String name){
        System.out.println(name);
    }

    @Override
    public void show() {
        System.out.println("电器电视机产品一号展示");
    }
}
