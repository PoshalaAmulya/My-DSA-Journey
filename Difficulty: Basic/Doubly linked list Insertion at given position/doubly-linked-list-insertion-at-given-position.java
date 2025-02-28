//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = prev = null;
    }
}

class DLinkedList {

    Node newNode(Node head, int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return head;
        }
        head.next = n;
        n.prev = head;
        head = n;
        return head;
    }

    void printList(Node node) {
        Node temp = node;
        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp.prev != null) {
            temp = temp.prev;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {

        DLinkedList DLL = new DLinkedList();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t > 0) {
            Node temp;
            Node head = null;
            Node root = null;
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(str[i]);
                head = DLL.newNode(head, x);
                if (root == null) root = head;
            }
            head = root;

            String str2[] = read.readLine().trim().split(" ");
            int pos = Integer.parseInt(str2[0]);
            int data = Integer.parseInt(str2[1]);

            Solution g = new Solution();
            head = g.addNode(head, pos, data);

            DLL.printList(head);
            while (head.next != null) {
                temp = head;
                head = head.next;
            }
            t--;
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        if(p==0){
            Node newHead=new Node(x);
            newHead.next=head;
            newHead.prev=null;
            head= newHead;
            return head;
        }
        Node temp=head;
        // Node pre=null;
        while(temp!=null){
            if(p==0){
                Node newNode= new Node(x);
                if(temp.next!=null){
                    newNode.next=temp.next;
                    newNode.prev=temp;
                    temp.next.prev=newNode;
                    temp.next=newNode;
                    // System.out.println(temp.data+" "+newNode.data+" "+newNode.next.data);
                    // System.out.println("*");
                }
                else{
                    newNode.prev=temp;
                    temp.next=newNode;
                }
                return head;
            }
            temp=temp.next;
            p--;
        }
        if(p==0){
            Node newNode= new Node(x);
            newNode.prev=temp;
            temp.next=newNode;
        }
        return head;
        // Your code here
    }
}