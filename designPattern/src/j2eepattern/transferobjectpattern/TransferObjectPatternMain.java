package j2eepattern.transferobjectpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: TransferObjectPatternMain
 * @description: 传输对象模式主函数
 * @data 2020/8/21 0021 15:23
 */
public class TransferObjectPatternMain {
    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        //输出所有的学生
        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }

        //更新学生
        StudentVO student =studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        //获取学生
        studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }
}
