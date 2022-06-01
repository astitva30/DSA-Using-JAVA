import java.util.Iterator;
import java.util.Stack;

class StackOperations{
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();

        //insering in stack by push operation
        s1.push(4);
        s1.push(8);
        s1.push(6);
        s1.push(4);
        System.out.println(s1);

        //deletion of top element using pop operation
        s1.pop();
        System.out.println(s1);

        //peek operation = seeing the top element
        System.out.println(s1.peek());

        //checking stack is empty or not = empty operation
        boolean status = s1.empty();
        System.out.println(status);

        //checking the size of a stack
        System.out.println(s1.size());

        //searching an element using search operation
        int indexFound = s1.search(4);
        System.out.println(indexFound);

        //sorting elements of stack using sort operator
        s1.sort(null);
        System.out.println(s1);

        //iterting over a stack using Iterator class
        Iterator it = s1.iterator();
        while(it.hasNext()){
            Object s2 = it.next();
            System.out.print(s2+"\t");
        }



        
    }
}