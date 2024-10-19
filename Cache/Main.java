public class Main {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);  // Cache capacity of 2

        cache.put(1, 10);
        cache.put(2, 20);
        System.out.println(cache.get(1)); // Output: 10

        cache.put(3, 30);  // Evicts key 2
        System.out.println(cache.get(2)); // Output: -1 (not found)

        cache.put(4, 40);  // Evicts key 1
        System.out.println(cache.get(1)); // Output: -1 (not found)
        System.out.println(cache.get(3)); // Output: 30
        System.out.println(cache.get(4)); // Output: 40
    }
}
