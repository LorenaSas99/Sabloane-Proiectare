public class Main {
    public static void main(String[] args){
        director d1=new director("Director1");
        director d2=new director("Director2");
        txt txt1=new txt("text1");
        txt1.setAlignStrategy(new AlignRight());
        d1.addContent(d2);
        d2.addContent(txt1);
        mp3 mp3=new mp3("music");
        mp3 mp4=new mp3("music1");
        svg svg=new svg("svg");
        d2.addContent(mp3);
        d1.addContent(svg);
        d1.addContent(mp4);
        txt txt2=new txt("text2");
        txt2.setAlignStrategy(new AlignCenter());
        d2.addContent(txt2);
        d1.print();

        fisier fisier=new fisier();
        fisier.printSizes();
    }
}

   /* Nume director : Director1 and it's files:
        Nume director : Director2 and it's files:
        text1>>>>
        music
        <<<<text2>>>>
        svg
        music1

        Întreaga dimensiune a fișierelor: 0 Kb, peste 0 directoare.
        Dimensiunea fisierelor txt: 0 Kb, Dimensiunea fisierelor svg: 0 Kb, Dimensiunea fisierelor Mp3: 0

    */
