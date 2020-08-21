package j2eepattern.compositeentitypattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: CompositeEntityPatternMain
 * @description: 组合实体模式主函数
 * @data 2020/8/21 0021 11:01
 */
public class CompositeEntityPatternMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
