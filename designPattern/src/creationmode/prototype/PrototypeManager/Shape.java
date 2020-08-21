package creationmode.prototype.PrototypeManager;

/**
 * @Program:designPattern
 * @Title: Shape
 * @Description: 拷贝接口
 * @Auther: YangCheng
 * @Create 2020/8/2 0002 19:46
 */
public interface Shape  extends Cloneable{
    Object clone();
    void countArea();
}
