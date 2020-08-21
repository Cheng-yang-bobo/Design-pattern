package j2eepattern.compositeentitypattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: CoarseGrainedObject
 * @description: 粗粒度对象
 * @data 2020/8/21 0021 11:03
 */
public class CoarseGrainedObject {
    DependentObject1 do1 = new DependentObject1();
    DependentObject2 do2 = new DependentObject2();

    public void setData(String data1, String data2){
        do1.setData(data1);
        do2.setData(data2);
    }

    public String[] getData(){
        return new String[] {do1.getData(),do2.getData()};
    }
}
