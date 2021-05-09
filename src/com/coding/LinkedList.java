package com.coding;

class Node{
    public int data;
    public Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
public class LinkedList {
    private Node head;
    private Node current;

    public LinkedList(int data){
        head=new Node();
        head.data=data;
        this.current=head;
    }
    private void append(int data){
        this.current.next=new Node();
        this.current.next.data=data;
        this.current=this.current.next;
    }

    private void remove(){
        Node current=head;
        Node previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
    }

    private void display(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    private void insert(int position,int data){
        Node current=head;
        Node previous=null;
        Node newNode=new Node();
        newNode.data=data;
        int count=0;
        while(current.next!=null){
            if(position==0){
                Node previousHead=head;
                head=newNode;
                head.next=previousHead;
                return;
            }
            if(count==position){
                previous.next=newNode;
                newNode.next=current;
                return;
            }
            previous = current;
            current = current.next;
            count++;

        }
        if(position==count){
            previous.next=newNode;
            newNode.next=current;
        }else{
            current.next=newNode;
        }
    }

    private void delete(int position){
        Node current=head;
        Node previous=null;
        Node newNode=new Node();
        int count=0;
        while(current.next!=null){
            if(position==0){
               head=head.next;
               return;
            }
            if(count==position){
                previous.next=current.next;
                return;
            }
            previous = current;
            current = current.next;
            count++;

        }
        if(position==count){
            previous.next=current.next;

        }
    }

    private void reverse(){
        Node cur=head;
        Node prev=null;
        Node next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        LinkedList linkedList =new LinkedList(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.remove();
//        linkedList.display();
        linkedList.insert(2,25);
        linkedList.insert(0,5);
        linkedList.display();
        linkedList.delete(3);
        linkedList.display();
        linkedList.reverse();
        linkedList.display();
//        linkedList.insert(0,5);
//        linkedList.display();

    }


}
