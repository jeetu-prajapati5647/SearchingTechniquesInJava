import java.util.Scanner;
public class LinearSearch {
    public static void search(int array[],int target){
        int flag=0;
        if(array.length==0){
            System.out.println("List is empty");
            return;
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                System.out.println("Element found at "+i+" index");
                flag++;
            }
        }
        if(flag==0){
            System.out.println("Element is not present in the list");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]={78,23,56,-10,100,-34,0,56};
        System.out.println("Enter the element you want to search");
        int target=sc.nextInt();
        search(array,target);
//        Time complexity- O(n)
    }
}
