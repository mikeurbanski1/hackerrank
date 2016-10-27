package urbanski.hackerrank.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by mike on 10/26/16.
 */
public class SparseArrays
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(in.readLine());

        Map<String, Integer> strings = new HashMap<>();
        while (N-- > 0)
        {
            String s = in.readLine();
            Integer count = null;
            if ((count = strings.get(s)) != null)
            {
                strings.put(s, count + 1);
            }
            else
            {
                strings.put(s, 1);
            }
        }

        int Q = Integer.parseInt(in.readLine());

        while (Q-- > 0)
        {
            String s = in.readLine();
            Integer count;
            System.out.println((count = strings.get(s)) == null ? 0 : count);
        }

        in.close();
    }
}
