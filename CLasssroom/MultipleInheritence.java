


//traditional approach for multiple inheritence

// class A{
//     public void run()
//     {

//     }
// }

// class B{
//     public void run()
//     {

//     }
// }

// class C extends A,B // compilation error or syntax error
// {

// }

//by the class and extends keyword we can't implement multiple inheritence
// but we can create structure like multiple inheritence use interface
//implements keyword

// interface : it is a data type(class like) that contains 
// unimplement methods or declaration of methods
//interface tells us what to do not how to do
//how to do in done by a class that inherit interface

interface A{
    void display(); // declaration
}

interface B{
    void show();
}

class C implements A,B{

    @Override // annotation
    public void display() // implements in child class
    {
        System.out.println("Interface A");
    }

    @Override
    public void show()
    {
        System.out.println("Interface B");
    }
}


class MultipleInheritence{
    public static void main(String args[])
    {
        C c = new C();
        c.display();
        c.show();
    }
}