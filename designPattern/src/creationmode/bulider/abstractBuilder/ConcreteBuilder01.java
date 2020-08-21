package creationmode.bulider.abstractBuilder;

/**
 * @Program:designPattern
 * @Title: ConcreteBuilder01
 * @Description: 具体建造者01
 * @Auther: YangCheng
 * @Create 2020/8/4 0004 14:40
 */
public class ConcreteBuilder01 extends AbstractBuilder{
    @Override
    public void buildPartA() {
        product.setPartA("组装空调零件A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("组装空调零件B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("组装空调零件C");
    }
}
