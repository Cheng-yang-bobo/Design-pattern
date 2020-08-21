package creationmode.factoryMethod.factory;

import creationmode.factoryMethod.product.Product;
import creationmode.factoryMethod.product.Product02;

/**
 * @Program:designPattern
 * @Title: Factory02
 * @Description: 工厂二号
 * @Auther: YangCheng
 * @Create 2020/8/3 0003 10:10
 */
public class Factory02 implements Factory {
    @Override
    public Product newProduct() {
        System.out.println("工厂二号正在创建二号产品");
        return new Product02();
    }
}
