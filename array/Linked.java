public class deletion {
    class Node{
        public Object item;
        public Node next;//pointing to next node
    }
    public class    Linkedlist{
        private int size;
        private Node head;
        private Object temp;
    
       public Linkedlist(){
            this.size=0;
            this.head= null;
            this.temp=null;
       }
       public int deletenode(int i){
        // Node node= new Node();
        // node.item= i;
        Node current=this.head;
        if (this.head==null){
            head=current.next;
        }
        while(current!=null){
            temp=current;
            this.head=current.next;
            
        }
            // this.head=node;

       }

    
}
