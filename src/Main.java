import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

         
          Node a = new Node(10, "A");
          Node b = new Node(8, "B");
          Node c = new Node(14, "C");
          Node d = new Node(6, "D");
          Node e = new Node(9, "E");
          Node f = new Node(12, "F");
          Node g = new Node(16, "G");
          Node h = new Node(18, "H");



        a.Left = b;
        a.Right = c;
        c.Right = g;
        g.Right = h;
        c.Left = f;
        b.Right = e;
        b.Left = d;

       
       TreeTraveler(a);



        /*
                  a
                /    \
                b      c
               /\      /\
              d  e     f g
                          \ 
                            h

        */
       
    }


    static void TreeTraveler(Node root){
             Stack<Node> stack = new Stack<Node>();

             Node current = root;
             

            
                 while(!stack.isEmpty()|| current != null){
                           
                           while(current != null){
                                stack.push(current);
                                current = current.Left;

                           }

                           current = stack.pop();
                           System.out.println(current.Name + " = visited");

                           current = current.Right;


                 }



            }

      

    
    


    static boolean NodeFinder(Node root, String Name){
         

      if(root == null) return false;
      if(root.Name == Name) return true;
      

      return NodeFinder(root.Left, Name) || NodeFinder(root.Right, Name);



    }
 static void BFS( Node root ){
         Queue<Node> queue = new LinkedList<Node>();

         queue.offer(root);
         


         while(!queue.isEmpty()){
             Node current = queue.poll();
             System.out.println(current.Name + " = visited");

             if(current.Left != null) queue.offer(current.Left);
             if(current.Right != null) queue.offer(current.Right);

            
         }


 }






}




