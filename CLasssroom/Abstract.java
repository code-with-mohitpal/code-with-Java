abstract class File {
    public File{

    }
    void reading(){
        System.out.println("Reading file.....");
    }
    abstract void writing(){

    }


    
}
class Data extends File {
    @Override
    public void writing(){
        System.out.println("writing data in file....");
    }


}
class Abstraction{
    public static void main(String[] args) {
        Data d1=new Data();
        d1.writing();
        d1.reading();
    }
}