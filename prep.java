public class Solution {
    
    // Find the largest number
    // Assume all numbers are positive
    // Return 0 if the array size is 0
    public int largestNumber(int[] arr) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    
    // Return a random number between 1 and 100
    public int randomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        return randomNumber;
    }
    
    // Return whether an positive number is a prime number
    public boolean isPrimeNumber(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;       
    }
    
    // Return a random prime number between 1 and 100
    public int randomPrimeNumber() {
        while (true) {
            int rpn = randomNumber();
            if (isPrimeNumber(rpn)) {
                return rpn;
            }
        }
    }
    
    // Array {1, 2, 4, 1, 2, 3} 
    // ArrayList {0, 0, 0, 0, 0}, size = 0. arrList.add(1) -> {1, 0, 0, 0, 0}, size = 1 arrList.add(3) -> {1, 3, 0, 0, 0}, size = 2
    
    // LinkedList
    // head                                 tail
    //   |                                   |
    // node1 -> node2 -> node3 -> node4 -> node5
    //   1        5        4        3        2
    class Node {
        int val;
        Node next;
    }
    
    class LinkedList {
        Node head;
        Node tail;
        int size;
    }
    
    // HashSet (1, 2, 3) HashSet<int> set = new HashSet<int>(); set.add(1); set.add(2); set.contains(3); set.isEmpty(); set.size();
    // HashMap
    
    // Return whether there is a duplicate number in the array
    public boolean hasDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        if (set.size() != arr.length) {
            return true;
        } else {
            return false;
        }
    }
    
    public void removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        int p = -1;
        for (int i = 0; i < arr.length; ++i) {
            if (!set.contains(arr[i]) {
                set.add(arr[i]);
                p += 1;
                arr[p] = arr[i];
            }
        }
        arr.resize(p + 1);
    }
    
    // Find the position of the largest number for the first n numbers in the array 
    public int largestNumberIndex(int[] arr, int n)  {
        int index = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        return index;
    }    
    
    // Sort an array of integers from smallest to largest
    public void sortArray(int[] arr) {
        int n = arr.length;
        while (n > 0) {
            int i = largestNumberIndex(arr, n);
            int tmp = arr[n - 1];
            arr[n - 1] = arr[i];
            arr[i] = tmp;
            n -= 1; 
        }
    }
    
    // Print an array backwards
    public void printArrayBackwards (int[] arr) {
        for (int i = arr.length; i > 0; i--) {
            System.out.print(arr[i - 1]);
        }
        
   // HashMap<Integer, Person> map; 
   
   // Stack
   // 1 -> 2 -> 5 -> 3 -> 4 
   // push(6)
   // 1 -> 2 -> 5 -> 3 -> 4 -> 6
   // pop() returns 6
   // 1 -> 2 -> 5 -> 3 -> 4 
   
   // Queue
   // 1 -> 2 -> 5 -> 3 -> 4 
   // add(6)
   // 1 -> 2 -> 5 -> 3 -> 4 -> 6
   // poll() returns 1
   // 2 -> 5 -> 3 -> 4 -> 6
   
   // Tree
   class Node {
       int val;
       Node left;
       Node right;
       
       public insert(Node node) {
           if (node.val < this.val) {
               if (this.left == null) {
                   this.left = node;
               } else {
                   this.left.insert(node);
               }
           } else if (node.val == this.val) {
               return;
           } else {
               if (this.right == null) {
                   this.right = node;
               } else {
                   this.right.insert(node);
               }
           }
       }
   }
             10 (root)
           /       \
          8        12 
        /  \      /  \
       3    9   11   100
     /  \            /
    1    5          20
     \    \
      2    6
    
   class Tree {
       Node root;
       
       public void insert(int num) {
           Node node = new Node();
           node.val = num;
           root.insert(node);
       }
   }
   
   // Display all nodes of a binary search tree in order. 
   public void printNode(Node root) {
       if (root == null) {
           return;
       }
       printNode(root.left);
       System.out.println(root.val);
       printNode(root.right); 
   }
   
   public void a(int n) {
       if (n == 0) {
           return;
       } else {
           a(n - 1);
       }
       print(n);
   }
   
   public void a() {
       b();
       print(3);
   }
   
   public void b() {
       c();
       print(2);
   }
   
   public void c() {
       print(1);
   }
   
   
   public void bubbleSort(int[] arr) {
       for (int j = 0; j < arr.length; ++j) {
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] > arr[i + 1]) {
                   int tmp = arr[i];
                   arr[i] = arr[i + 1];
                   arr[i + 1] = tmp;
               }
           }
       }
       
       
   // Hash:
   // integer -> [0, 10]
   // mod 11, 0 -> 0, 11 -> 0, 1 -> 11, 12 -> 1, 23 -> 1
   
   // arr[0] -> 
   // arr[1] -> 1 -> 12
   // arr[2] -> 24
   ...
   // arr[10] ->
   
   // set.add(1) 1 % 11 = 1
   // set.add(12) 12 % 11 = 1
   // set.add(24) 24 % 11 = 2
}
