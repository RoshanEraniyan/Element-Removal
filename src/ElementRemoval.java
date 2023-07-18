import java.util.*;

class Solution
{
    public void calculate(Integer[] array)
    {
        Arrays.sort(array,Collections.reverseOrder());
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i]*(i+1);
        }
        System.out.println(sum);
    }
}

class ElementRemoval
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Integer[] array=new Integer[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        Solution solution =new Solution();
        solution.calculate(array);
    }
}

