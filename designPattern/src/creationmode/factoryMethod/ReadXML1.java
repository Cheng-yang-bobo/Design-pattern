package creationmode.factoryMethod;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @Program:designPattern
 * @Title: ReadXML1
 * @Description: 阅读文档
 * @Auther: YangCheng
 * @Create 2020/8/3 0003 10:16
 */
public class ReadXML1 {
    public static Object getObject(){
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("src/creationMode.factoryMethod/config1.xml"));
            //获取包含类名的文本节点
            NodeList n1=doc.getElementsByTagName("className");
            Node classNode=n1.item(0).getFirstChild();
            //class.forName的字符串注意符合包的命名方式
            String cName="creationMode.factoryMethod.factory."+classNode.getNodeValue();
            System.out.println("新类名"+cName);
            //通过类名生成实例对象并将其返回
            Class<?> c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
