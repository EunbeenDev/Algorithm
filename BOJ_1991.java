//Silver_트리 순회
import java.io.*;
import java.util.Scanner;

public class BOJ_1991 {
//    이진 트리 입력
//    전위 순회, 중위 순회, 후위 순회 결과 출력

//    Node class
    static class Node{
        char value;
        Node left;
        Node right;

        Node(char value, Node left, Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    static int N;
    static Node head = new Node('A',null,null);

    static void insertNode(Node temp, char root,char left, char right) {
        //root 인가?
        if(temp.value==root) {
            //child node== . -> null, 아니면 new node 생성.
            temp.left=(left=='.'? null:new Node(left,null,null));
            temp.right=(right=='.'? null:new Node(right,null,null));
        }
        else {
            if(temp.left != null) insertNode(temp.left, root, left, right);
            if(temp.right != null) insertNode(temp.right, root, left, right);
        }
    }

    static void preOrder(Node n) {
        if(n==null)	return;
        System.out.print(n.value);
        preOrder(n.left);
        preOrder(n.right);

    }
    static void inOrder(Node n) {
        if(n==null)	return;
        inOrder(n.left);
        System.out.print(n.value);
        inOrder(n.right);

    }
    static void postOrder(Node n) {
        if(n==null)	return;
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.value);

    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());

        for(int i=0;i<N;i++) {
            String [] str = sc.nextLine().split(" ");
            char root = str[0].charAt(0);
            char left = str[1].charAt(0);
            char right = str[2].charAt(0);
            insertNode(head,root,left,right);
        }

        preOrder(head);
        System.out.println();
        inOrder(head);
        System.out.println();
        postOrder(head);

    }
}

