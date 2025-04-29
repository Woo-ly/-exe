package Librarymanage;
import java.util.ArrayList;
import java.util.Scanner;
public class List {
    public static void main(String[] args) {
        //创建一个集合：用于存放相同的个体，注意作用范围，将list放在循环外面
        ArrayList list=new ArrayList();
        while (true) {
            //打印菜单
            System.out.println("------欢迎来到[老吴书城]------");
            System.out.println("1.展示书籍");
            System.out.println("2.上新书籍");
            System.out.println("3.下架书籍");
            System.out.println("4.退出应用");
            //借助Scanner类
            Scanner sc = new Scanner(System.in);
            //友好提示
            System.out.println("请输入你想执行功能的序号");
            //利用键盘录入序号；
            int choice = sc.nextInt();
            //根据功能序号进行后续操作
            if (choice == 1) {
                System.out.println("[老吴书城】》》》》》1.展示书籍");
                //对集合进行遍历查看
                for(int i=0;i<=list.size()-1;i++){
                    Book b=(Book)(list.get(i));
                    System.out.println(b.getBno()+"\t"+b.getBName()+"\t"+b.getbAuthor());
                }
            }
            if (choice == 2) {
                System.out.println("[老吴书城】》》》》》2.上新书籍");
                //从键盘录入书籍信息：
                System.out.println("请录入书籍编号");
                int bno=sc.nextInt();
                //请输入书籍名称
                System.out.println("请录入书籍名称");
                String bName=sc.next();
                //请输入书籍作者
                System.out.println("请录入书籍作者");
                String bAuthor=sc.next();
                //每上新一本书籍就要创建一本书籍的对象：
                Book b=new Book();
                b.setBno(bno);
                b.setbName(bName);
                b.setbAuthor(bAuthor);
                System.out.println("书籍信息录入成功");

                list.add(b);//添加个体到集合去

            }
            if (choice == 3) {
                System.out.println("[老吴书城】》》》》》3.下架书籍");
                //请输入下架书籍的编号：
                System.out.println("请输入下架书籍的编号");
                int delo=sc.nextInt();
                for(int i=0;i<=list.size()-1;i++){
                    Book b=(Book)(list.get(i));
                    if(b.getBno()==delo){
                        list.remove(i);
                        System.out.println("下架成功");
                        break;
                    }
                }
            }
            if (choice == 4) {
                System.out.println("[老吴书城】》》》》》4.退出应用");
                break;
            }
        }
    }
}
