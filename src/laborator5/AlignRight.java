package laborator5;

public class AlignRight implements AlignStrategy{
    @Override
    public void render(String paragraph) {
        System.out.println(paragraph + "+++++");

    }
}
