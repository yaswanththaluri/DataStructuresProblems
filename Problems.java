//    https://www.geeksforgeeks.org/find-triplet-sum-two-equals-third-element/
//    Given an array of integers you have to find three numbers such that sum of two elements equals the third element.

import java.util.Scanner;
import java.util.Arrays;
class Test
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int x=0; x<t; x++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count=0;
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            for(int i=n-1; i>=0; i--)
            {
                int j = 0;
                int k = i-1;

                while(j<k)
                {
                    if(arr[i] == arr[j] + arr[k])
                    {
                        count++; // print i, j, k for getting triplet elements
                        j++;
                    }
                    else if(arr[i]>arr[j]+arr[k])
                    {
                        j++;
                    }
                    else
                    {
                        k--;
                    }
                }
            }
            System.out.println(count);
        }
        
    }
}
