class type{

    type() // non parametrize constructor. its run when when a obect of this class will create
    {
        System.out.println("Constructor called object is created !!!");
    }

    type(String name, int quan) // a parametrize constructor
    {
        this.name= name;
        this.quan= quan;

        System.out.println("parametrize constructor is called");
    }

    type (type obj4)
    {
        this.name= obj4.name;
        this.quan= obj4.quan;

        System.out.println("Copy Counstroctor called");
    }

    String name ;
    int quan;

    void fun()
    {
        System.out.println("name of pen is :"+name);
        System.out.println("quan of pens are :"+quan);
    }
}



public class encapsulation{

    public static void main(String[] args)
    {
        type obj = new type(); // first object.
        obj.name = "pointer";
        obj.quan=15;

        obj.fun();

System.out.println("for second object");

        type obj2 = new type(); // second object.
        obj2.name="marker";
        obj2.quan=50;
        obj2.fun();

        System.out.println("for third object");
        
        type obj3 = new type("cut pen",12);
        obj3.fun();

       System.out.println("for Fourth object");

       type obj4 = new type(obj);
       obj4.fun();
        



    }
}