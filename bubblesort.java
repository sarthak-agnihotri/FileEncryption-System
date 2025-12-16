import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n,i,j,temp;
        System.out.println("Enter the array length: ");
        n=obj.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("After Sorting: ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
