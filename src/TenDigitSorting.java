import java.util.*;

public class TenDigitSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        ArrayList <Integer> lst  = new ArrayList<>();
        for(int x:array)
            lst.add(x);

        System.out.println(digitSorting(lst));
        // 15 11 7 19

    }
    public static ArrayList digitSorting(ArrayList arr)
    {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i,Integer j)
            {
                int num1=(i/10)%10;
                int num2=(j/10)%10;
                if(num1 != num2)
                {
                    return Integer.compare(num1,num2);
                }
                else
                {
                    return Integer.compare(j, i);
                    //If the ten-digits are the same,
                    // compare the numbers themselves.
                    // Reverse order to get max value first.
                }
            }
        };

        Collections.sort(arr,com);
        return arr;
    }
}
/*
Ten Digit Sorting
Given an array A of N integers. Sort the array in increasing order of the value at the tens place digit of every number.

If a number has no tens digit, we can assume value to be 0.If 2 numbers have same tens digit, in that case number with max value will come firstSolution should be based on comparator.
Example Input

Input 1:
A = [15, 11, 7, 19]
Input 2:
A = [2, 24, 22, 19]

Output 1:
[7, 19, 15, 11]
Output 2:
[2, 19, 24, 22]
 */