package creationmode.prototype;

/**
 * @Program:designPattern
 * @Title: Main
 * @Description: 原型模式运行
 * @Auther: YangCheng
 * @Create 2020/8/2 0002 18:06
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizetypeTest obj1 = new RealizetypeTest("帅", "杨", "13", "西湖区");
        RealizetypeTest obj2 = (RealizetypeTest) obj1.clone();
        //clone两个对象
        System.out.println("两个对象是否相同创建" + (obj1 == obj2));
        //更改原型属性查看clone对象属性是否一致
        obj1.setTest("帅哥杨铖");
        System.out.println(obj2.getTest());
        System.out.println("变更后基础属性是否一致" + (obj2.getTest() == obj1.getTest()));
        //更改原型引用属性的对象属性，查看是否一致
        obj1.getTestClone().setName("杨铖");
        System.out.println(obj2.getTestClone().getName());
        System.out.println("变更后引用对象属性是否一致" + (obj2.testClone.name == obj1.testClone.name));
    }
}
