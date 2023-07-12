import java.util.Scanner;
public class RecursiveBinarySearch {
  static   int flag=0;
    public static void search(int array[],int lower_idx,int higher_idx,int target){
        if(array.length==0) return;
       if(lower_idx>=higher_idx) return;
       int middle_idx=(lower_idx+higher_idx)/2;
       if(array[middle_idx]==target){
           System.out.println("Element found at "+middle_idx+" index");
           flag++;
           return;
        } else if (array[middle_idx]<target) {
           search(array,middle_idx+1,higher_idx,target);

       }
       else{
           search(array,lower_idx,middle_idx-1,target);
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]={-10,1,12,19,25,34,44,56,78,99,100};
        System.out.println("Enter the element you want to search..? ");
        int target=sc.nextInt();
        search(array,0,array.length-1,target);
        if(flag==0){
            System.out.println("Element is not present in the list");
        }
    }
}
