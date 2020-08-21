package creationmode.abstractFactory.factory;

import creationmode.abstractFactory.product.Product11;
import creationmode.abstractFactory.product.Product21;

/**
 * @Program:designPattern
 * @Title: Factory2
 * @Description: 具体工厂2--电器空调
 * @Auther: YangCheng
 * @Create 2020/8/3 0003 17:46
 */
public class Factory2 implements AbstractFactory{

    @Override
    public Product11 newProduct1(String name) {
        System.out.println("电器空调工厂2准备创建产品1"+name);
        return new Product11(name);
    }

    @Override
    public Product21 newProduct2(String name) {
        System.out.println("电器空调工厂2准备创建产品2"+name);
        return new Product21(name);
    }
}
