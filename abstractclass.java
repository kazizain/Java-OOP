abstract class animal{ // making animal class abstract.

animal()
{
    System.out.println("animal class constructed");
}

public abstract void walk(); // here we make walk functin abstract.
public abstract void sound();

}


class cat extends animal {


    cat()
    {
        System.out.println("Cast class object created");
    }

    @Override    // have must be written when we are implementing abstarct class in inherited class.
    public void walk()
    {
        System.out.println("Walks on four legs");
    }

    public void sound()
    {
        System.out.println("Meeow sounds");
    }

}


class hen extends animal {

    hen()
    {
        System.out.println("Hen class object created");
    }
    @Override    // have must be written when we are implementing abstarct class in inherited class.
    public void walk()
    {
        System.out.println("Walks on two legs");
    }

    public void sound()
    {
        System.out.println("kukruku sounds");
    }

}



public class abstractclass 
{
    public static void main(String[] args)
    {
        
    cat persian = new cat();

    persian.walk();
    persian.sound();

    hen desi = new hen();

    desi.walk();
    desi.sound();


    }

}
