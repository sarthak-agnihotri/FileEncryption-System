import java.util.*;
public class arrayhalf {
    int arr[][];
    int r,c;
    arrayhalf(int row,int col){
        r=row;
        c=col;
        arr=new int[row][col];
    }
    void input(){
        Scanner obj=new Scanner(System.in);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=obj.nextInt();
            }
        }
    }
    void display(){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]%2==0){
                    System.out.print(arr[i][j]/2+" ");
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
        System.out.print("Enter number of rows: ");
        row=ob.nextInt();
        System.out.print("Enter number of columns: ");
        col=ob.nextInt();
        arrayhalf a=new arrayhalf(row,col);
        a.input();
        a.display();
    }
}