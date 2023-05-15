package mypack;

public class test {
   
//linkedlist program in java?
public boolean remove(String data){
    Node previous = head;
    Node current = head.getNext();
    while (current != null) {
        String dataOld = current.getData();
        if ((dataOld == null && data == null) || (dataOld != null && dataOld.equals(data))) {
            Node afterRemoved = current.getNext();
            previous.setNext(afterRemoved);
            if (afterRemoved == null) { // i.e. removing last element
                last = previous;
            }
            size--;
            return true;
        } else {
            previous = current;
            current = current.getNext();
        }
    }
    return false;
}





    
}
