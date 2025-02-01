package JavaDSA02;

import java.util.Scanner;

public class ArrayMethod {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    // Traditional way to get sum
    // int sum = 0;
    // for (int x : arr) {
    //   sum += x;
    // }

    // System.out.println(sum);

    

    sc.close();
  }
} // Traditional way to get sum
