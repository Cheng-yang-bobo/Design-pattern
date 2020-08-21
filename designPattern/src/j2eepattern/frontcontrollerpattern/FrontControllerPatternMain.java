package j2eepattern.frontcontrollerpattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: FrontControllerPatternMain
 * @description: 前端控制器模式
 * @data 2020/8/21 0021 11:27
 */
public class FrontControllerPatternMain {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");

    }
}
