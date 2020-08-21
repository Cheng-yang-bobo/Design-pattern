package creationmode.factoryMethod.factory;

import creationmode.factoryMethod.product.Product;
import creationmode.factoryMethod.product.Product01;

/**
 * @Program:designPattern
 * @Title: Factory01
 * @Description: 工厂一号
 * @Auther: YangCheng
 * @Create 2020/8/3 0003 10:09
 */
public class Factory01 implements Factory {
    @Override
    public Product newProduct() {
        System.out.println("工厂一号正在创建一号产品");
        return new Product01();
    }
}
