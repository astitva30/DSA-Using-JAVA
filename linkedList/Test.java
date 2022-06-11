import java.util.Scanner;
class Node{
    private int data;
    private Node next;

    //constructors
    Node(){
        data = 0;
        next = null;
    }
    Node(int d, Node n){
        data = d;
        next = n;
    }

    //setting the data
    public void setData(int d){
        data = d;
    }
    public void setNext(Node n){
        next = n;
    }

    //getting the data
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }

}

class LinkedList{
    private int size;
    private Node start;

    //Constructors
    public LinkedList(){
        size =0;
        start = null;
    }

    //function to check weather a linked list is empty or not
    public boolean isEmpty(){
        if(start==null){
            return true;
        }else{
            return false;
        }
    }

    //function to get size of a list
    public int getListSize(){
        return size;
    }

    //printing the elements of a list
    public void viewList(){
        Node t;
        if(isEmpty()==true){
            System.out.println("List is Empty");
        }else{
            t = start;
            System.out.println("LIST: ");
            for(int i=0;i<size;i++){
                System.out.print(t.getData()+" ");
                t=t.getNext();
            }
        }
    }
    
    //inserting an element at the beginning
    public void insertAtFirst(int val){
        Node n;
        n = new Node();
        n.setData(val);
        n.setNext(start);
        start = n;
        size++;
    }

    //inserting an element at the end
    public void insertAtLast(int val){
        Node n,t;
        n = new Node();
        n.setData(val);
        t=start;
        if(t==null){
            start = n;
        }else{
            while(t.getNext()!=null){
                t=t.getNext();
            }
            t.setNext(n);
        }
        size++;
    }

    //inserting at Nth position
    public void insertAtPos(int val, int pos){
        if(pos==1){
            insertAtFirst(val);
        }else if(pos==size+1){
            insertAtLast(val);
        }else if(pos>1 && pos<=size){
            Node n,t;
            n= new Node(val,null);
            t=start;
            for(int i=1;i<pos-1;i++){
                t=t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        }else{
            System.out.println("Insertion not possible at "+pos);
        }
    }

    //function to delete first element
    public void deleteFirst(){
        if(start == null){
            System.out.println("List is already Empty");
        }
        else{
            start = start.getNext();
            size--;
        }
    }
    
    //function to delete last element
    public void deleteLast(){
        if(start == null){
            System.out.println("List is already Empty");
        }else if(size==1){
            start=null;
            size--;
        }else{
            Node t;
            t=start;
            for(int i=1;i<size-1;i++){
                t=t.getNext();
            }
            t.setNext(null);
            size--;
        }
    }

    //delete node at Nth position
    public void deleteAtPos(int pos){
        if(start==null){
            System.out.println("List is already empty");
        }else if(pos<1 || pos>size){
            System.out.println("Invalid Position");
        }else if(pos==1){
            deleteFirst();
        }else if(pos==size){
            deleteLast();
        }else{
            Node t;
            t=start;
            for(int i=1;i<pos-1;i++){
                t=t.getNext();
            }
            Node t1 =t.getNext();
            t.setNext(t1.getNext());
            size--;
        }
    }
}


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        boolean flag = true;
        System.out.println();
            System.out.println("1. Add item to the list at the start.");
            System.out.println("2. Add item to the list at the last.");
            System.out.println("3. Add item to the list at pirticular position.");
            System.out.println("4. Delete first element from the list.");
            System.out.println("5. Delete last element from the list.");
            System.out.println("6. Delete element at pirticular position.");
            System.out.println("7. View List.");
            System.out.println("8. Exit.");
        while(flag){
            
            System.out.print("\nEnter your choice:");
            int choice = sc.nextInt();
            int val, pos;
            switch(choice){
                case 1:
                    System.out.print("Enter value of the list item:");
                    val = sc.nextInt();
                    list.insertAtFirst(val);
                    break;
                
                case 2:
                    System.out.print("Enter value of list item:");
                    val = sc.nextInt();
                    list.insertAtLast(val);
                    break;
                
                case 3:
                    System.out.print("Enter value and position respectively:");
                    val = sc.nextInt();
                    pos = sc.nextInt();
                    list.insertAtPos(val,pos);
                    break;
                
                case 4:
                    list.deleteFirst();
                    break;
                
                case 5:
                    list.deleteLast();
                    break;
                
                case 6:
                    System.out.print("Enter the position of which you want to delete the element:");
                    pos = sc.nextInt();
                    list.deleteAtPos(pos);
                    break;
                
                case 7:
                    list.viewList();
                    break;
                
                case 8:
                    flag = false;
                    break;
            }
        }
    }
}
