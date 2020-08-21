package creationmode.factoryMethod.factory;

import creationmode.factoryMethod.product.Product;

/**
 * @Program:designPattern
 * @Title: AbstractFacotry
 * @Description: 抽象工厂类
 * @Auther: YangCheng
 * @Create 2020/8/3 0003 9:41
 */
public interface Factory {
    /**
     * @Param []
     * @description 创建产品
     * @author YangCheng
     * @date 2020/8/3 0003 10:05
     * @return creationMode.factoryMethod.product.AbstractProduct
     * @throws
     */
    Product newProduct();
}
