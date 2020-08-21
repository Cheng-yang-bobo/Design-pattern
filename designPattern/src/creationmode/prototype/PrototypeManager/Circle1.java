package creationmode.prototype.PrototypeManager;

import java.util.Scanner;

/**
 * @Program:designPattern
 * @Title: Circle
 * @Description: 圆
 * @Auther: YangCheng
 * @Create 2020/8/2 0002 19:55
 */
public class Circle1 implements Shape{

        @Override
        public Object clone() {
            Circle1 w = null;
            try {
                w = (Circle1) super.clone();
            } catch (CloneNotSupportedException e) {
                System.out.println("拷贝圆失败!");
            }
            return w;
        }

        @Override
        public void countArea() {
            int r = 0;
            System.out.print("这是一个圆，请输入圆的半径：");
            Scanner input = new Scanner(System.in);
            r = input.nextInt();
            System.out.println("该圆的面积=" + 3.1415 * r * r + "\n");
        }
    }


