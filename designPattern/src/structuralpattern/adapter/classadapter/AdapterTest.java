package structuralpattern.adapter.classadapter;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: AdapterTest
 * @description: 类适配器模式主函数
 * @data 2020/8/6 0006 10:32
 */
public class AdapterTest {

    public static void main(String[] args) {
        System.out.println("类适配器模式测试:");
        Traget traget=new ClassAdapter();
        traget.request();
    }
}
