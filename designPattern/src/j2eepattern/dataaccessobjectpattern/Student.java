package j2eepattern.dataaccessobjectpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: Student
 * @description: 学生对象
 * @data 2020/8/21 0021 11:19
 */
public class Student {
    private String name;
    private int rollNo;

    Student(String name, int rollNo){
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
