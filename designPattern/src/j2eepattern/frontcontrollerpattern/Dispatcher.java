package j2eepattern.frontcontrollerpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: Dispatcher
 * @description: 调度器
 * @data 2020/8/21 0021 13:51
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
