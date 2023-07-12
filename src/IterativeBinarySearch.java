import java.util.Scanner;
public class IterativeBinarySearch {
    public static void search(int array[],int target){
        int flag=0;
        int lower_idx=0;
        int higher_idx=array.length-1;
        if(array.length==0) return;
      try {
          while (lower_idx <= higher_idx) {
              int middle_idx = (lower_idx + higher_idx) / 2;
              if (array[middle_idx] == target) {
                  System.out.println("Element found at " + middle_idx + " index");
                  flag++;
                  return;
              } else if (array[middle_idx] < target) {
                  lower_idx = middle_idx + 1;

              } else {
                  higher_idx = middle_idx - 1;
              }
          }
      }
      finally {
          if(flag==0){
              System.out.println("Element is not present in the list");
          }
      }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]={-10,1,12,19,25,34,44,56,78,99,100};
        System.out.println("Enter the element you want to search..? ");
        int target=sc.nextInt();
        search(array,target);
    }
}
