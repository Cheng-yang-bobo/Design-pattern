package creationmode.bulider.product;

/**
 * @Program:designPattern
 * @Title: Product
 * @Description: 产品具体类
 * @Auther: YangCheng
 * @Create 2020/8/4 0004 14:02
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public String getPartA() {
        return partA;
    }

    public String getPartB() {
        return partB;
    }

    public String getPartC() {
        return partC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }

    public void remove() {
        partA = null;
        partB = null;
        partC = null;
    }

    public void show() {
        //显示产品特性
        System.out.println("终于组装好一个产品了,里面的组成有" + this.toString());
    }
}
