
import java.util.ArrayList;

public class Section implements Element{
    public String sectionTitle;
    ArrayList<Element> content= new ArrayList<>();
    public Section(String sectionTitle,ArrayList<Element> content){
        this.sectionTitle=sectionTitle;
        this.content=content;
    }
    public Section(String sectionTitle){
        this.sectionTitle=sectionTitle;
    }
    public int add(Element elm){
        content.add(elm);
        return 1;
    }
    public void remove(Element elm){
        if(content.contains(elm)){
            content.remove(elm);
        }
    }

    public Element getElement(int index){
        return content.get(index);
    }
    public void print(){
        for(Element e:content){
            //System.out.println(e);
            e.print();
        }
    }
}
