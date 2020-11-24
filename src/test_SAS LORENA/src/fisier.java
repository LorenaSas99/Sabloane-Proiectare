public class fisier implements Visitor{

    int txtSize=0;
    int svgSize=0;
    int mp3Size=0;
    int totalSize=0;
    int directoare=0;

    public void visit(txt txt) {
        totalSize+=5;
        txtSize+=5;
    }
    public void visit(mp3 mp3) {
        totalSize+=3000;
        mp3Size+=3000;
    }
    public void visit(svg svg) {
        totalSize+=45;
        svgSize+=45;
    }

    public void visit(director director){
        directoare++;
    }

    public void printSizes(){
        System.out.println("\n Întreaga dimensiune a fișierelor: "+totalSize+" Kb, peste "+directoare+" directoare. \n " +
                "Dimensiunea fisierelor txt: "+txtSize+" Kb, Dimensiunea fisierelor svg: "+svgSize+" Kb, Dimensiunea fisierelor Mp3: "+mp3Size);
    }


}
