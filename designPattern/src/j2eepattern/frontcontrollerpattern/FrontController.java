package j2eepattern.frontcontrollerpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: FrontController
 * @description: 前端控制器
 * @data 2020/8/21 0021 13:52
 */
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request) {
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
