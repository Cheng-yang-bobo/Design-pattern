package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Hero
 * @description:
 * @data 2020/8/10 0010 11:22
 */
public class Hero {
    private Long id;
    private String name;

    public Hero(){

    }

    public Hero(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + id + '\'' +
                ", country='" + name + '\'' +
                '}';
    }

    public static List<Hero> getSql(){

        List<Hero> heroList =  new ArrayList<>();

        Hero liubei = new Hero(1L, "刘备");
        Hero zhugeliang = new Hero(2L, "诸葛亮");

        Hero sunce = new Hero(3L, "孙权");
        Hero zhouyu = new Hero(4L, "周瑜");

        Hero yuanshao = new Hero(5L, "袁绍");
        Hero zhangjiao = new Hero(6L, "张角");

        heroList.add(liubei);
        heroList.add(zhugeliang);

        heroList.add(sunce);
        heroList.add(zhouyu);

        heroList.add(yuanshao);
        heroList.add(zhangjiao);

        return heroList;
    }
}
