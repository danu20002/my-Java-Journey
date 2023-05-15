import java.util.Scanner;

public class test{
    public static void main(String[] args){
         mari mymanu=new mari();
         mymanu.barking();
         mymanu.mewing();
         mymanu.loving();
         manaa mymana=new manaa();
         mymana.mydad();
    }
}
interface dan{
     void barking();
     void mewing();

}
interface  kannu{
    void loving();//by default public or abstract
}
class mari implements dan,kannu{

    public void barking(){
        System.out.println("bou bou");
    }
    public void mewing(){
        Scanner sc=new Scanner(System.in);
        String cat;
        String bat="mew";
        System.out.println("enter the cats sound");
         cat=sc.next();
        if(cat.equals(bat)){
            System.out.println("that's true");
        }
        else{
            System.out.println("that's not");
        }

    }

    @Override
    public void loving() {
        System.out.println("i am in");
    }
}
enum love{
    Mom,dad,bro
}
 class manaa {
 public void mydad(){
    love mylove=love.dad;
    System.out.println(mylove);
    switch (mylove) {
        case Mom -> System.out.println("yes i love my mom");
        case dad -> System.out.println("yes i love my dad");
        case bro -> System.out.println("yes i love my bro");
        default -> System.out.println("choice not found");
    }
}
}