package creationmode.abstractFactory.factory;

import creationmode.abstractFactory.product.Product11;
import creationmode.abstractFactory.product.Product21;

/**
 * @Program:designPattern
 * @Title: Factory1
 * @Description: 具体工厂1--电器电视机
 * @Auther: YangCheng
 * @Create 2020/8/3 0003 17:43
 */
public class Factory1 implements AbstractFactory{

    @Override
    public Product11 newProduct1(String name) {
        System.out.println("电器电视机工厂1准备创建产品1"+name);
        return new Product11(name);
    }

    @Override
    public Product21 newProduct2(String name) {
        System.out.println("电器电视机工厂1准备创建产品2"+name);
        return new Product21(name);
    }
}
