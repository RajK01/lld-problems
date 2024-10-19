import java.util.HashMap;

class LRUCache {
    // Node class for the Doubly Linked List
    private class Node {
        int key, value;
        Node prev, next;
        
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private HashMap<Integer, Node> cache; // Key-Node mapping
    private Node head, tail; // Dummy head and tail nodes for the doubly linked list

    // Constructor to initialize the LRU Cache with a given capacity
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        
        // Initialize dummy head and tail nodes
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    // Method to get the value of the given key
    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1; // Key not found
        }
        Node node = cache.get(key);
        remove(node);  // Move accessed node to the front
        addToFront(node);
        return node.value;
    }

    // Method to insert or update a key-value pair
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node); // Remove the old node
        } else if (cache.size() == capacity) {
            Node lru = tail.prev;  // Get least recently used node
            remove(lru);  // Remove it from the linked list
            cache.remove(lru.key);  // Remove from HashMap
        }
        Node newNode = new Node(key, value);
        addToFront(newNode);  // Add new node to the front
        cache.put(key, newNode);  // Update HashMap
    }

    // Helper method to remove a node from the doubly linked list
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Helper method to add a node to the front (most recently used)
    private void addToFront(Node node) {
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }
}
