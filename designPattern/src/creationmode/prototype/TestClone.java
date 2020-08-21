package creationmode.prototype;

/**
 * @Program:designPattern
 * @Title: TestClone
 * @Description: 测试clone
 * @Auther: YangCheng
 * @Create 2020/8/2 0002 18:52
 */
public class TestClone implements Cloneable{
    String name;
    String age;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TestClone(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
