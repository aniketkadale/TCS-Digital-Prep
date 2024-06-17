class LinkedList {
    int val;
    LinkedList next;

    LinkedList() {
    }

    LinkedList(int val) {
        this.val = val;
    }

    LinkedList(int val, LinkedList next) {
        this.val = val;
        this.next = next;
    }
}

class ReverseLL {
    // T.C -> O(N) S.C -> O(N)
    public static LinkedList reverseLinkedList(LinkedList head) {
        if (head == null || head.next == null)
            return head;

        LinkedList prev = null;
        LinkedList present = head;
        LinkedList next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;

            if (next != null) {
                next = next.next;
            }
        }

        return prev;

    }

    // T.C -> O(N) S.C -> O(N) rec stack space
    public static LinkedList reverseListRecursive(LinkedList head) {
        if (head == null || head.next == null) {
            return head;
        }

        LinkedList newHead = reverseListRecursive(head.next);
        LinkedList front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    public static void display(LinkedList head) {
        LinkedList temp = head;

        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.print("NULL");
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(2);
        head.next.next = new LinkedList(3);
        head.next.next.next = new LinkedList(4);
        head.next.next.next.next = new LinkedList(5);

        display(head);

        LinkedList reversedHead = reverseListRecursive(head);
        display(reversedHead);
    }
}
