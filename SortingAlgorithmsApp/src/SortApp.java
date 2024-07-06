//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class SortApp {
    public SortApp() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers to be sorted:");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] numbers = new int[inputArray.length];

        int choice;
        for(choice = 0; choice < inputArray.length; ++choice) {
            numbers[choice] = Integer.parseInt(inputArray[choice]);
        }

        System.out.println("Choose number of sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        choice = scanner.nextInt();
        if (choice == 1) {
            bubbleSort(numbers);
            System.out.println("Array sorted using Bubble Sort:");
        } else {
            if (choice != 2) {
                System.out.println("Invalid choice. Please enter 1 or 2.");
                return;
            }

            selectionSort(numbers);
            System.out.println("Array sorted using Selection Sort:");
        }

        int[] var6 = numbers;
        int var7 = numbers.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            int num = var6[var8];
            System.out.print("" + num + " ");
        }

    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for(int i = 0; i < n - 1; ++i) {
            for(int j = 0; j < n - 1 - i; ++j) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for(int i = 0; i < n - 1; ++i) {
            int minIndex = i;

            int j;
            for(j = i + 1; j < n; ++j) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            j = array[minIndex];
            array[minIndex] = array[i];
            array[i] = j;
        }

    }
}
