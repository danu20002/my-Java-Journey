package mypack;
interface mangu{
    public void animalsound();
    public  void run();
}
class kangu implements mangu{
    @Override
    public void animalsound(){
        System.out.println(" iam Strong");
    }

    @Override
    public void run() {
        
        System.out.println("i am danu");
        
    }
}
public interface sangu{
    public static void main(String[] args){
        kangu mymangu=new kangu();
        mymangu.run();
        mymangu.animalsound();
    }
}