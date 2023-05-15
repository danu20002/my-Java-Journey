//import static javax.swing.UIManager.get;

//import java.util.*;
public class singlell {
    Node head;
   static  class Node{
        String data;
        Node next;
         Node(String data){
             this.data=data;
             this.next=null;
         }
    }
     public void addfirst(String data){
        Node newnode=new Node(data);
         if (head != null) {
             newnode.next = head;
         }
         head=newnode;
     }
     public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;

        }
        Node currNode=head;
        while(currNode.next !=null){
            currNode=currNode.next;

        }
        currNode.next=newnode;
     }

     public void printlist(){

        if(head==null){
            System.out.println("list is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            currNode=currNode.next;
            System.out.println("the list is  "+currNode.data);
        }
         System.out.print("null");
     }
     public void deletefirst(){
       if(head!=null){
           head=head.next;
       }
     }
    public static void main(String[] args){
     singlell list=new singlell();
     list.addfirst("danu");
     list.addfirst("manu");
     list.addlast("kanu");

     list.printlist();


       }
    }

