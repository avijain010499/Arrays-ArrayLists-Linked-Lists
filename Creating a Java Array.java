class Source {

    public static void main(String[] args) {
        int random[ ] = {2, 4, 5, 10};
        printArray(random);
    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\n");
        }

    }
}
