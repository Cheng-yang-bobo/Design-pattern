package j2eepattern.transferobjectpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: StudentVO
 * @description: 传输对象
 * @data 2020/8/21 0021 15:23
 */
public class StudentVO {

    private String name;
    private Integer rollNo;

    StudentVO(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
