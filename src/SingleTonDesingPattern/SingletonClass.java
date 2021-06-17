package SingleTonDesingPattern;

public class SingletonClass {

    public static void main(String[] args) {

        Abc obj1 = Abc.getInstance();

        Abc obj2 = Abc.getInstance();


    }

}

class Abc{

//    1 . Creating a static Instance of the Class

    static Abc obj = new Abc();

//    make the default Constructor as Private

    private Abc(){

    }

//    Creating a static method call as getInstance that would return the object

    public static Abc getInstance(){

        return obj;
    }

}
