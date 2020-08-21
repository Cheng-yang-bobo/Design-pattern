package j2eepattern.dataaccessobjectpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: DataAccessObjectPatternMain
 * @description: 数据访问对象模式
 * @data 2020/8/21 0021 11:15
 */
public class DataAccessObjectPatternMain {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //输出所有的学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }


        //更新学生
        Student student =studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }
}
