import java.util.Arrays;

class HashTable {
    public static int size = 10;
    public static int[] arr = new int[size]; 

    void insert(int k) {
        int hashFun = k % size;
        if (arr[hashFun] == 0) {
            arr[hashFun] = k;
        } else {
            for (int i = 0; i < size; i++) {
                int hashFunction = (hashFun + i) % size;
                if (arr[hashFunction] == 0) {
                    arr[hashFunction] = k;
                    break;
                }
            }
        }
    }

    void display() {
        System.out.println(Arrays.toString(arr));
    }

    boolean search(int key) {
        int hashFun = key % size;
        for (int i = 0; i < size; i++) {
            int index = (hashFun + i) % size;
            if (arr[index] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HashTable ob = new HashTable();
        ob.insert(10);
        ob.insert(76);
        ob.insert(6);
        ob.insert(33);
        ob.insert(24);
        ob.display();

        System.out.println("Searching for 10: " + ob.search(10));
        System.out.println("Searching for 7: " + ob.search(7));
    }
}