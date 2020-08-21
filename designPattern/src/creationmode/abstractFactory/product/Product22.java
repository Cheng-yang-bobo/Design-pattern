package creationmode.abstractFactory.product;

/**
 * @Program:designPattern
 * @Title: Product22
 * @Description: 具体工厂2创建的具体产品2
 * @Auther: YangCheng
 * @Create 2020/8/4 0004 10:17
 */
public class Product22 implements AbstractProduct {

    public Product22(String name){
        System.out.println(name);
    }

    @Override
    public void show() {
        System.out.println("电器空调工厂产品二号展示");
    }
}
