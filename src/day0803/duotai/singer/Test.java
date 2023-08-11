package day0803.duotai.singer;

public class Test {
    public static void main(String[] args) {
        Erhu erhu = new Erhu("二胡");
        Instrument instrument = new Instrument();
        Musician musician = new Musician();

        musician.play(erhu);


    }
}
