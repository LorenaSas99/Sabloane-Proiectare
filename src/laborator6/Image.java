package laborator6;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
   /* private String imageName;

    Image(String name){
        this.imageName=name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print(){
        System.out.println("Image with name: "+this.imageName);
    }

    public int add(Element elm) throws  Exception{
        throw new Exception("Not supported by Leaf Elements");
    }

    public void remove(Element elm) throws Exception{
        throw new Exception("Not supported by Leaf Elements");
    }

    public Element getElement(int index) throws Exception{
        throw new Exception("Not supported by Leaf Elements");
    }

    @Override
    public void accept(Visitor visitor) {visitor.visit( Image: this); }*/

    public String imageName;
    Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void print()
    {
        System.out.println("Image with name: "+imageName);
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}
