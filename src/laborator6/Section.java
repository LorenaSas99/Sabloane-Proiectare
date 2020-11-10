package laborator6;

import java.util.ArrayList;

public class Section implements Element {
    /*protected String title;
    protected ArrayList<Element> content = new ArrayList<>();

    Section(String sectionTitle){
        this.title=sectionTitle;
    }

    public int add(Element elm) throws Exception{
        content.add(elm);
        return content.indexOf(elm);
    }

    public void remove(Element elm) throws Exception{
        content.remove(elm);
    }

    public Element getElement(int index) throws Exception {
        if (index >= 0 && index < content.size()) {
            return content.get(index);
        }
        return null;
    }

    public void print(){
        System.out.println(title);
        for(Element elm : content){
            elm.print();
        }
    }

    @Override
    public void accept(Visitor visitor){
        for(Element elm : content){
            elm.accept(visitor);
        }
    }*/

    public String title;
    public ArrayList<Element> content=new ArrayList<>();

    Section(String t)
    {
        title=t;
    }

    public void add(Element elm)
    {
        content.add(elm);
    }

    public void remove(Element elm)
    {
        content.remove(elm);
    }

    public Element getElement(int index){
        return content.get(index);
    }

    public void print()
    {
        System.out.println(title);
        for(Element e:content)
        {

            e.print();
        }
    }
    public void accept(Visitor visitor){
        for (Element el:content) {

            el.accept(visitor);
        }
    }
}
