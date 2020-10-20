import java.util.ArrayList;

public class Table implements Element{
    public String title;
    public Table(String title){
        this.title=title;
    }
    ArrayList<Element> content=new ArrayList<>();

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Table{" + "title='" + title + '\'' + "}";
    }
    public void print(){
        System.out.println(this.title);
    }
}
