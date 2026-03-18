class LinkedList {
  Node head;

  LinkedList() {
    head = null;
  }

  void addNode(Node node) {
    Node current = head;
    if (current == null) {
      head = node;
      return;
    }
    while (current.next != null) {
      current = current.next;
    }
    current.next = node;
  }

  Node getNode(int index) {
    Node current = head;
    for (int i = 0; i < index; i++) {
      if (current == null) {
        return null;
      }
      current = current.next;
    }
    return current;
  }

  void removeNode(int index) {
    Node current = head;
    if (index == 0) {
      head = head.next;
      return;
    }
    for (int i = 0; i < index - 1; i++) {
      if (current.next == null) {
        return;
      }
      current = current.next;
    }
    current.next = current.next.next;
  }

  void printNodes() {
    Node current = head;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }
}

class Node {
  int data;
  Node next;
}