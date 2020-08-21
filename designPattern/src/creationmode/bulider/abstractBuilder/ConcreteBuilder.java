package creationmode.bulider.abstractBuilder;

/**
 * @Program:designPattern
 * @Title: ConcreteBuilder
 * @Description: 具体建造者:继承了抽象接口
 * @Auther: YangCheng
 * @Create 2020/8/4 0004 14:20
 */
public class ConcreteBuilder extends AbstractBuilder {
    @Override
    public void buildPartA() {
        product.setPartA("组装电脑零件A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("组装电脑零件B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("组装电脑零件C");
    }
}
