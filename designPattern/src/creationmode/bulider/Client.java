package creationmode.bulider;

import creationmode.bulider.abstractBuilder.AbstractBuilder;
import creationmode.bulider.abstractBuilder.ConcreteBuilder;
import creationmode.bulider.abstractBuilder.ConcreteBuilder01;
import creationmode.bulider.product.Product;

/**
 * @Program:designPattern
 * @Title: Client
 * @Description: 客户类
 * @Auther: YangCheng
 * @Create 2020/8/4 0004 14:01
 */
public class Client {
    public static void main(String[] args) {
        AbstractBuilder abstractBuilder = new ConcreteBuilder();
        DirectorOrManger directorOrManger = new DirectorOrManger(abstractBuilder);
        //管理者使用一号方案组装模板
        Product product = directorOrManger.construct();
        product.show();
        //清空属性
        product.remove();
        //管理者使用二号方案组装模板
        product = directorOrManger.construct01();
        product.show();
        //使用产品2实行组装
        abstractBuilder = new ConcreteBuilder01();
        directorOrManger = new DirectorOrManger(abstractBuilder);
        product.remove();
        product = directorOrManger.construct();
        product.show();
    }
}
