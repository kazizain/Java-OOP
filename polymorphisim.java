import java.util.Scanner; // library for taking input.
class student{

student()
{
    System.out.println("Constructor Run");
}

String name;
int age;
int rollno;

// polymorphisim using function over loading
void printinfo(String nam)
{
    name = nam;

    System.out.println("student name is : "+name);
}


void printinfo(int roll)
{
    rollno = roll;

    System.out.println("student rollno is : "+rollno);
}


void printinfo(int roll , int ag)
{
    rollno = roll;
    age= ag;

    System.out.println("student rollno is : "+rollno);
    System.out.println("student age is :"+age);
}



}


public class polymorphisim 
{
    public static void main(String[] args)
    {
        
        student st = new student();

        Scanner obj = new Scanner(System.in);  // object created for scanner to take input in java.

        System.out.println("Enter name of student: ");
        String n = obj.nextLine();
        System.out.println("Enter age of student: ");
        int a = obj.nextInt();
        System.out.print("Enter rollno of student: ");
        int ro = obj.nextInt();


        st.printinfo(a, ro);

         st.printinfo(n);

    }
}
