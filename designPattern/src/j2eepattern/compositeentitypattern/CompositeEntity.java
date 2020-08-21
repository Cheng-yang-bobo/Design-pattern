package j2eepattern.compositeentitypattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: CompositeEntity
 * @description: 组合实体
 * @data 2020/8/21 0021 11:04
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
