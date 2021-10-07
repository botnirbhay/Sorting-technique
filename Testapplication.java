package sorting.myjava;
import java.util.Objects;
import java.util.Scanner;

public class Testapplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int s=sc.nextInt();
        SortingTech s1= new SortingTech(s);
        s1.init();
        /*
        System.out.println("enter the number of elements u want to insert :");
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            long value=sc.nextLong();
            s1.insert(value);
        }*/
        System.out.println("after the bubble sort we got :");
        s1.bubblesort();
        s1.disp();
        System.out.println("after the selection sort we got :");
        s1.selectionsort();
        s1.disp();
        System.out.println("after the insertion sort we got :");
        s1.insertionsort();
        s1.disp();
    }
}