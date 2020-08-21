package creationmode.bulider;

import creationmode.bulider.abstractBuilder.AbstractBuilder;
import creationmode.bulider.product.Product;

/**
 * @Program:designPattern
 * @Title: DirectorOrManger
 * @Description: 指挥者或者管理者
 * @Auther: YangCheng
 * @Create 2020/8/4 0004 14:23
 */
public class DirectorOrManger {
    private AbstractBuilder abstractBuilder;

    public DirectorOrManger(AbstractBuilder abstractBuilder) {
        this.abstractBuilder = abstractBuilder;
    }

    /**
     * @return creationMode.bulider.product.Product
     * @throws
     * @Param []
     * @description 产品组装
     * @author YangCheng
     * @date 2020/8/4 0004 14:28
     */
    public Product construct() {
        abstractBuilder.buildPartA();

        abstractBuilder.buildPartB();

        abstractBuilder.buildPartC();

        return abstractBuilder.getResult();
    }


    public Product construct01() {
        abstractBuilder.buildPartA();

        abstractBuilder.buildPartB();

        return abstractBuilder.getResult();
    }
}
