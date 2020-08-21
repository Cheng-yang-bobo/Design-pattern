package behavioralpattern.state.scorestate;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ScoreStateTest
 * @description: 学生成绩装调模式实践
 * @data 2020/8/19 0019 15:31
 */
public class ScoreStateTest {
    public static void main(String[] args) {

        ScoreContext account=new ScoreContext();
        System.out.println("学生成绩状态测试：");

        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);
    }
}
