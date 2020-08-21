package creationmode.prototype.PrototypeManager;

import java.util.HashMap;

/**
 * @Program:designPattern
 * @Title: ProtoTypeManager
 * @Description: 管理器
 * @Auther: YangCheng
 * @Create 2020/8/2 0002 19:57
 */
public class ProtoTypeManager {

    private HashMap<String, Shape> ht = new HashMap<String, Shape>();

    public ProtoTypeManager() {
        ht.put("Circle", new Circle1());
        ht.put("Square", new Square());
    }

    public void addshape(String key, Shape obj) {
        ht.put(key, obj);
    }

    public Shape getShape(String key) {
        Shape temp = ht.get(key);
        return (Shape) temp.clone();
    }
}
