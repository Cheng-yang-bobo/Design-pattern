package j2eepattern.dataaccessobjectpattern;

import java.util.List;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: StudentDao
 * @description: 数据访问对象接口
 * @data 2020/8/21 0021 11:19
 */
public interface StudentDao {

    List<Student> getAllStudents();

    Student getStudent(int rollNo);

    void updateStudent(Student student);

    void deleteStudent(Student student);
}
