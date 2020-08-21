package creationmode.bulider.abstractBuilder;

import creationmode.bulider.product.Product;

/**
 * @Program:designPattern
 * @Title: AbstractBuilder
 * @Description: 抽象建造者
 * @Auther: YangCheng
 * @Create 2020/8/4 0004 14:16
 */
public abstract class AbstractBuilder {
    /**
     * 创建产品对象
     */
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    //返回产品对象
    public Product getResult() {
        return product;
    }

}
