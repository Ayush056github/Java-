class LinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

   
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

  
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

   
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    
    public int getSize() {
        int size = 0;
        Node curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst("Poornima");
        list.addFirst("College");
        list.printList();

        list.addLast("Rajasthan");
        list.printList();

        list.addLast("India");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

      
        System.out.println("Size of list: " + list.getSize());

        list.addFirst("This");
        System.out.println("Size after adding one element: " + list.getSize());
    }
}
