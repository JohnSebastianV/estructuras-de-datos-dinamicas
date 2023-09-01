public class Node
{
    public int value;
    public Node next;

    public Node(int value)
    {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList
{
    public static Node AddNode(Node list, int value)
    {
        if (list == null)
        {
            return new Node(value);
        }

        if (value < list.value)
        {
            Node newNode = new Node(value);
            newNode.next = list;
            return newNode;
        }

        list.next = AddNode(list.next, value);
        return list;
    }

    public static void Main(string[] args)
    {
        // Create a linked list with values 1, 3, 5, 7
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);

        // Call the AddNode function to add a new node with value 4
        head = AddNode(head, -1);

        // Print the linked list to verify that the new node was added
        Node current = head;
        while (current != null)
        {
            Console.WriteLine(current.value);
            current = current.next;
        }
    }
}
