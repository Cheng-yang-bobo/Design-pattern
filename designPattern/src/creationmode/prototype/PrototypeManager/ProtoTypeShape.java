package creationmode.prototype.PrototypeManager;

/**
 * @Program:designPattern
 * @Title: ProtoTypeShape
 * @Description: 运行测试
 * @Auther: YangCheng
 * @Create 2020/8/2 0002 19:53
 */
public class ProtoTypeShape {
    public static void main(String[] args) {
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape obj1 = (Circle1) pm.getShape("Circle");
        obj1.countArea();
        Shape obj2 = (Shape) pm.getShape("Square");
        obj2.countArea();
    }
}

