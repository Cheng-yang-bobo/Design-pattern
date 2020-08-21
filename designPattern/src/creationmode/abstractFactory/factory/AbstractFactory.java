package creationmode.abstractFactory.factory;


import creationmode.abstractFactory.product.Product11;
import creationmode.abstractFactory.product.Product21;

/**
 * @Program:designPattern
 * @Title: creationMode.abstractFactory
 * @Description: 抽象工厂接口--电器
 * @Auther: YangCheng
 * @Create 2020/8/3 0003 17:24
 */
public interface AbstractFactory {
    Product11 newProduct1(String name);

    Product21 newProduct2(String name);
}
