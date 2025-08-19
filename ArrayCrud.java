class Array {
    private int arr[];
    private int size;

    Array(int n) {
        this.arr = new int[n];
        this.size = 0;
    }

    int get(int index) {
        return arr[index];
    }

    int getSize() {
        return size;
    }

    void add(int ele) {
        if (size == arr.length) {
            System.out.println("Array is Full");
            return;
        }

        arr[size++] = ele;
    }

    void add(int index, int ele) {
        if (size == arr.length) {
            System.out.println("Array is Full");
            return;
        }

        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        arr[index] = ele;
        size++;
    }

    int remove(int index) {
        if (size == 0 || size <= index || index < 0) {
            System.out.println("Cannot Delete Element");
            return -1;
        }
        int ele = arr[index];
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
        return ele;
    }

    int removeFirstEle(int ele) {
        int index = findIndex(ele);
        if (index == -1) {
            System.out.println("Element Doesn't Exist");
            return -1;
        }

        int deleted = remove(index);
        return deleted;
    }

    int update(int index, int ele) {
        if (size == 0 || size <= index || index < 0) {
            System.out.println("Cannot Update At Index " + index);
            return -1;
        }

        int updatedEle = arr[index];
        arr[index] = ele;
        return updatedEle;
    }

    boolean search(int ele) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == ele) {
                return true;
            }
        }
        return false;
    }

    int findIndex(int ele) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

public class ArrayCrud {
    public static void main(String[] args) {
        Array arr = new Array(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(1, 8);
        System.out.println(arr.getSize());
        // arr.remove(4);
        arr.remove(0);
        System.out.println(arr.update(0, 7));
        System.out.println(arr.removeFirstEle(3));
        System.out.println(arr.findIndex(4));
        System.out.println(arr.search(3));
        arr.printArray();
    }

}
