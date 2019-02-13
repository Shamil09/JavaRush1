package tree6;

public class Tree {

    private Node root;

    public Node find(int key) {
        Node current = root;
        while (current.value != key) {
            if (key < current.value) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(Integer value) {
        Node node = new Node();
        node.value = value;
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (value < current.value) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = node;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }
    public Node getSuccesor(Node node){
        Node successorParent = node;
        Node successor = node;
        Node current = node.rightChild;

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != node.rightChild){
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = node.rightChild;
        }
        return successor;
    }

    public boolean delete(int id) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (current.value != id) {
            parent = current;
            if (id < current.value){
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null){
                return false;
            }
        }

        // Если узел не имеет потомков

        if (current.leftChild == null && current.rightChild == null){
            if (current == null){
                root = null;
            } else if(isLeftChild){
                parent.leftChild = null;
            }else{
                parent.rightChild = null;
            }
        }
        // Если нет правого потомка
        else if(current.rightChild == null){
            if (current == null){
                root = current.leftChild;
            } else if(isLeftChild){
                parent.leftChild = current.leftChild;
            }else{
                parent.rightChild = current.leftChild;
            }
        }
        // Если нет левого потомка
        else if(current.leftChild == null){
            if (current == null){
                root = current.rightChild;
            } else if(isLeftChild){
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        } else {
            Node successor = getSuccesor(current);
            if (current == root){
                root = successor;
            }else if(isLeftChild){
                parent.leftChild = successor;
            }else {
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }
        return true;
    }


    public void displayTree(){
        // Тело метода
    }

    private void inOrder(Node rootNode){
        if(rootNode != null){
            inOrder(rootNode.leftChild);
            rootNode.display();
            inOrder(rootNode.rightChild);
        }
    }
    public Node min() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }
    public Node max() {

        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.rightChild;
        }

        return last;
    }
}

class Node{
    public Integer value;
    public Node leftChild;
    public Node rightChild;

    public void display(){
        System.out.println("value - "+value);
    }
}