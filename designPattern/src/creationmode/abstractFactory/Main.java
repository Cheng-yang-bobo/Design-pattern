package creationmode.abstractFactory;

import creationmode.abstractFactory.factory.AbstractFactory;
import creationmode.abstractFactory.factory.Factory1;
import creationmode.abstractFactory.factory.Factory2;
import creationmode.abstractFactory.product.Product11;

/**
 * @Program:designPattern
 * @Title: Main
 * @Description: 抽象工厂
 * @Auther: YangCheng
 * @Create 2020/8/3 0003 16:49
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory af;
        Product11 p1;
        af = new Factory1();
        p1 = af.newProduct1("生产电视机一号");
        p1.show();
        af = new Factory2();
        p1 = af.newProduct1("生产空调一号");
        p1.show();
    }
}
