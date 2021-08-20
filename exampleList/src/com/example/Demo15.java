package com.example;

public class Demo15 {
    public static void main(String[] args) {
        String[] strings = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        CircleList circleList = new CircleList();
        circleList.run(strings);
        circleList.sout();
//        Object[] objs = {'A',8,2,5,10,3,'Q','J',9,4,7,6,'K'};
//        for (Object o:objs) System.out.print(o.toString() + " ");
    }
}
class CircleList{
    private Node head;
    class Node{
        private String data;
        private Node next;

        public Node(String data){
            this(data, null);
        }

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public CircleList(){
        head = new Node("A");
        Node p = head;
        int i=1;
        while (p.next == null && i<13){
            Node nextNode = new Node(null);
            p.next = nextNode;
            p = p.next;
            i++;
        }
        p.next = head;
    }
    public void run(String[] strings){
        Node p = head;
        for (int i=2;i<=13;i++){
            for (int j=0;j<i;j++){
                p = p.next;
                if (p.data != null){
                    j--;
                }
            }
            p.data = strings[i-1];
        }
    }
    public void sout() {
        Node p = head;
        for(int i=0;i<13;i++) {
            System.out.print(p.data+" ");
            p = p.next;
        }
        System.out.println();
    }
}
