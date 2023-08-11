package day0803.duotai.super02;

public class Factory {

    public Bag makeBag(int i){
        Bag bag = null;
        switch (i){
            case 1:
                bag = new InstrumentBag("Black","碳纤维");
                break;
            case 2:
                bag = new SchoolBag();
                break;
        }
        return bag;
    }
}
