import java.util.ArrayList;
public class director implements Element{
    String nume;
    private ArrayList<Element> content = new ArrayList<>();
    public director(String nume){
        this.nume=nume;
    }
    public String getNume(){
        return nume;
    }
    public void setNume(String nume){
        this.nume= nume;
    }
    public void addContent(Element elem){
        content.add(elem);
    }
    public void print() {
        System.out.println("Nume director : "+this.nume+" and it's files:");
        for(Element i:content){
            i.print();
        }
    }

}
