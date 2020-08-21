package structuralpattern.flyweight.gobang;

import java.awt.*;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: BlackPieces
 * @description: 黑子
 * @data 2020/8/12 0012 18:55
 */
public class BlackPieces implements ChessPieces {

    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x, pt.y, 30, 30);
    }

}
