import java.util.*;
public class arrayuppertriangle {
    int arr[][];
    int r,c;
    arrayuppertriangle(int row,int col){
        r=row;
        c=col;
        arr= new int[row][col];
    }
    void input(){
        Scanner obj=new Scanner(System.in);
        int i,j;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                arr[i][j]=obj.nextInt();
            }
        }
    }
    void display(){
        int i,j;
        System.out.println();
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(i<j){
                    System.out.print("0"+" ");
                }
                else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int row,col;
        System.out.println("Enter number of rows: ");
        row=ob.nextInt();
        System.out.println("Enter number of columns: ");
        col=ob.nextInt();
        arrayuppertriangle a=new arrayuppertriangle(row, col);
        a.input();
        a.display();
    }
}
