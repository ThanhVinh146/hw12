class OddOccurrenceFinder {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15};

        findOddNumbers(numbers);
    }

    public static void findOddNumbers(int[] arr) {
        int maxIndexElement = 0;
        for (int num : arr) {
            if (num > maxIndexElement) {
                maxIndexElement = num;
            }
        }

        int[] countArray = new int[maxIndexElement + 1];

        for (int num : arr) {
            countArray[num]++;
        }

        System.out.println("Numbers appearing an odd number of times:");
        //O(n)
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}






