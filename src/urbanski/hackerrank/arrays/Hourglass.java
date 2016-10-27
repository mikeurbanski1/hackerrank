package urbanski.hackerrank.arrays;

import java.util.Scanner;

/**
 * Created by mike on 10/26/16.
 */
public class Hourglass
{
    static final int ARRAY_HEIGHT = 6;
    static final int ARRAY_WIDTH = 6;
    static final int HOURGLASS_WIDTH = 3;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[ARRAY_HEIGHT][ARRAY_WIDTH];
        for (int arr_i = 0; arr_i < ARRAY_HEIGHT; arr_i++)
        {
            for (int arr_j = 0; arr_j < ARRAY_WIDTH; arr_j++)
            {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        in.close();

        int maxSum = Integer.MIN_VALUE;

        for (int r = 0; r <= ARRAY_HEIGHT - 3; r++)
        {
            for (int c = 0; c <= ARRAY_WIDTH - HOURGLASS_WIDTH; c++)
            {
                int sum = getHourglassSum(arr, r, c);
                if (sum > maxSum)
                {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }

    static int getHourglassSum(int[][] arr, int r, int c)
    {
        int sum = 0;
        for (int i = 0; i < HOURGLASS_WIDTH; i++)
        {
            sum += arr[r][c + i];
            sum += arr[r + 2][c + i];
        }
        sum += arr[r + 1][c + HOURGLASS_WIDTH / 2];
        return sum;
    }
}
