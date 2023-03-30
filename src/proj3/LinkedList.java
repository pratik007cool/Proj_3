package proj3;

/**
 *  Fill this in.  Really.  And the methods too.
 */
public class LinkedList {
    private int length;
    private ListNode firstNode;

    public LinkedList() {
        length = 0;
        firstNode = null;
    }

    public int getLength() {
        return length;
    }

    /**
     * insertAtHead
     * insertion at the head of linkedlist.
     *
     * @param data
     */
    public void insertAtHead(String data) {
        ListNode newnode = new ListNode(data);
        if (getLength() == 0) {
            firstNode = newnode;
        } else {
            newnode.next = firstNode;
            firstNode = newnode;
        }
        length++;
    }

    /**
     * insertion at the tail of the linkedlist.
     *
     * @param data
     */
    public void insertAtTail(String data) {
        ListNode newNode = new ListNode(data);
        if (getLength() == 0) {
            firstNode = newNode;
        } else {
            ListNode current = firstNode;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

//    /**
//     * count the number of nodes in the LL.
//     * @return count
//     */
//    public int count(){
//        if(firstNode != null){
//            ListNode current = firstNode;
//            int count = 0;
//            while(current != null){
//                current = current.next;
//                count++;
//            }
//            return count;
//        }
//        else{
//            return 0;
//        }
//    }

    public String toString() {
        String toReturn = "(";
        ListNode runner = firstNode;
        while (runner != null) {
            toReturn = toReturn + runner;
            runner = runner.next;
            if (runner != null) {
                toReturn = toReturn + ", ";
            }
        }
        toReturn = toReturn + ")";
        return toReturn;
    }

    /**
     * Return the ith item in the LL.
     *
     * @param
     * @return
     */
    public String getIthItem(int index) {
        if(index == 0){
            return firstNode.data;
        } else if (index >= this.getLength() || index < 0) {
            return null;
        } else{
            ListNode runner = this.firstNode;
            for(int i = 1; i <= index; i++){
                if(runner.next != null){
                    runner = runner.next;

                }
            }
            return runner.data;
        }

    }

    /**
     * Remove
     */
    public void remove(int index){
        if(index == 0){
            firstNode = firstNode.next;
        } else if (index <= this.getLength()) {
            ListNode runner = firstNode;
            ListNode current = runner;
            for (int i = 1; i <= index; i++){
                current = runner;
                runner = runner.next;
            }
            current.next = runner.next;
        }
        length--;
    }
}


