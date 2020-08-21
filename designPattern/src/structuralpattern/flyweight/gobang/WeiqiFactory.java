package structuralpattern.flyweight.gobang;

import java.util.ArrayList;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: WeiqiFactory
 * @description: 享元工厂角色
 * @data 2020/8/12 0012 19:02
 */
public class WeiqiFactory {
    private ArrayList<ChessPieces> qz;
    public WeiqiFactory()
    {
        qz=new ArrayList<ChessPieces>();
        ChessPieces w=new WhitePieces();
        qz.add(w);
        ChessPieces b=new BlackPieces();
        qz.add(b);
    }
    public ChessPieces getChessPieces(String type)
    {
        if(type.equalsIgnoreCase("w"))
        {
            return (ChessPieces)qz.get(0);
        }
        else if(type.equalsIgnoreCase("b"))
        {
            return (ChessPieces)qz.get(1);
        }
        else
        {
            return null;
        }
    }
}
