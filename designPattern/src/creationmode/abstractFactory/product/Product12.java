package creationmode.abstractFactory.product;

/**
 * @Program:designPattern
 * @Title: Product12
 * @Description: 具体工厂一创建的具体产品2
 * @Auther: YangCheng
 * @Create 2020/8/4 0004 10:17
 */
public class Product12 implements  AbstractProduct{
    public Product12(String name){
        System.out.println(name);
    }

    @Override
    public void show() {
        System.out.println("电器电视机产品二号展示");
    }
}
