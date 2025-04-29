package Librarymanage;

public class Book {
    //属性：
    //书籍编号
    private int bno;
    //书籍名称
    private String bName;
    //书籍作者
    private String bAuthor;

    public int getBno() {
        return bno;
    }
    public void setBno(int bno) {
        this.bno = bno;
    }
    public String getBName() {
            return bName;
    }
    public void setbName(String bName){
        this.bName=bName;
    }
    public String getbAuthor(){
        return bAuthor;
    }
    public void setbAuthor(String bAuthor){
        this.bAuthor=bAuthor;
    }
    //构造器
    public Book(int bno,String bName,String bAuthor) {
        this.bno=bno;
        this.bName=bName;
        this.bAuthor=bAuthor;
    }
    public Book(){

    }
}
