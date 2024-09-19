import java.util.Arrays;

public class test
{
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3},{2,3,4},{3,4,5},{4,5,6}};

        int m = 4;

        for(int i = 0; i < m; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
