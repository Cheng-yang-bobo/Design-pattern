package j2eepattern.compositeentitypattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: Client
 * @description: 客户端
 * @data 2020/8/21 0021 11:05
 */
public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }
}
