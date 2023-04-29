package datastructures;

public class Main {
    public static void printItems(int n) {
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println(i+" "+j);
                count++;
            }
        }
        System.out.println(count + " operations");
    }

    public static void main(String[] args) {
        printItems(10);
    }
}