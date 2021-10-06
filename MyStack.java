package Task1;

public class MyStack<T> {
    private static class Node<T>{
        T data;
        Node<T> next;
        Node(){};
        Node(T data,Node<T> next){
            this.data=data;
            this.next=next;
        }
    }
    Node<T> node=new Node<>();

    //栈顶添加一个元素
    public void push(T data){
        //把之前的node放到新生成的node的next元素中
        node=new Node<T>(data,node);
    }

    //弹出栈顶元素
    public void pop(){
        if(node.data!=null) {
            node=node.next;
        }
    }

    //返回栈顶元素
    public T top(){
        return node.data;
    }

    public static void main(String[] args) {
        MyStack<String> myStack=new MyStack<>();
        myStack.push("hello");
        System.out.println(myStack.top());
        myStack.push("world");
        System.out.println(myStack.top());
        myStack.pop();
        System.out.println(myStack.top());
    }
}