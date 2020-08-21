package creationmode.factoryMethod;

import creationmode.factoryMethod.factory.Factory;
import creationmode.factoryMethod.factory.Factory02;
import creationmode.factoryMethod.product.Product;

/**
 * @Program:designPattern
 * @Title: Main
 * @Description: 工厂模式
 * @Auther: YangCheng
 * @Create 2020/8/2 0002 22:41
 */
public class Main {
    public static void main(String[] args) {
        try {
            Product a;
            Factory af;
            af=(Factory) ReadXML1.getObject();
            a=af.newProduct();
            a.show();
            af=new Factory02();
            a=af.newProduct();
            a.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
