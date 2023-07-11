import java.util.*;
public class LinearSearchWithRecursion{
    static int flag=0;
    static void search(int a[],int idx,int srch){
        if(idx==a.length || idx<0){
            return;

        }
        if(a[idx]==srch){
            System.out.println("element found at "+idx+" index");
            flag++;
            return;
        }
        search(a, idx+1, srch);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={22,3,67,6,37,56};
        System.out.println("enter the number you want to search");
        int srch=sc.nextInt();
        search(a, 0,srch);
        if(flag==0){
            System.out.println("Element is not present in the list");
        }
    }
}