import java.util.Scanner;
public class AntiDiagonal {
    static void antiDiagonal(int arr[][],int rows,int cols)
    {
        for (int i=0;i<cols;i++)
        {
            int x=0,y=i;
            while (x<cols && y>=0)
            {
                System.out.print(arr[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }
        for (int i=0;i<rows;i++)
        {
            int x=i,y=cols-1;
            while (x<rows && y>=0)
            {
                System.out.print(arr[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int cols=scanner.nextInt();
        int array[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        antiDiagonal(array,rows,cols);
    }
}
