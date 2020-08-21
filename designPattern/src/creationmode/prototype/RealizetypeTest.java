package creationmode.prototype;

/**
 * @Program:designPattern
 * @Title: RealizetypeTest
 * @Description: 原型模式基础实现
 * @Auther: YangCheng
 * @Create 2020/8/2 0002 18:36
 */
public class RealizetypeTest implements Cloneable {
    private String test;

    TestClone testClone;

    @Override
    public Object clone()  {
        try {

            System.out.println("具体原型复制成功");
            return super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("具体原型复制失败");
        }
        return null;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public TestClone getTestClone() {
        return testClone;
    }

    public void setTestClone(TestClone testClone) {
        this.testClone = testClone;
    }

    public RealizetypeTest(String test, String name, String age, String address) {
        System.out.println("具体原型创建成功");
        this.setTest(test);
        this.testClone = new TestClone(name, age, address);
    }
}
