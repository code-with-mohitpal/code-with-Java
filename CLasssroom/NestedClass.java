class OuterClass {

    int id;
    String name;
    public OuterClass(int id,String name){
        this.id=id;
        this.name=name;
    }
    class InnerClass{
        int age;
        String address;
        public void displayInner(){
            System.out.println("ID : "+id);
            System.out.println("Name : "+name);
        }
    }
}
class NestedClass {
    public static void main(String[] args) {
        OuterClass oc=new OuterClass(21, "Raj");
        OuterClass.InnerClass ic=oc.new InnerClass();
        ic.displayInner();
    }
}
