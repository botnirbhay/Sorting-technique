package sorting.myjava;
import java.util.Objects;
import java.util.Random;

class Mylongarray
{
    protected int siz;
    protected int currentindex;
    protected Long[] arr; // just declaring a array named arr
    Mylongarray(int size)
    {
        siz=size;
        currentindex=0;
        arr=new Long[size];
    }
    public void insert(Long value)
    {
        if(siz==currentindex)
        {
            Long[] newarray=new Long[siz+1];
            if(currentindex>=0)System.arraycopy(arr,0,newarray ,0,currentindex);
            arr=newarray;
            siz=siz+1;}

        arr[currentindex]=value;
        currentindex++;}

    public void insert(int index,Long value){

        if(index<arr.length){ // first we check index if it is inside bounds or u can just write that choose on
            // available index
            int j = 0;
            Long[] tempArray = new Long[arr.length+1];
            if(arr[index]!= null){
                for(int i =0;i< arr.length+1;i++){
                    if(i==index){
                        tempArray[i]=value;
                    }
                    else {
                        tempArray[i] = arr[j];
                        j++;
                    }
                }
                arr = tempArray;
                siz = siz+1;
            }
            else{
                arr[index]=value;
            }
        }
        else{
            System.out.println("Index out of Bound");
            //insert(value);
        }
    };
    public int dupDelete(long value){
        //deletes the number if present and returns true
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(Objects.equals(value,arr[i])){
                Long[] tempArray = new Long[arr.length];
                int j = 0;
                for (Long aLong : arr) {
                    if (!Objects.equals(value, aLong)) {
                        tempArray[j] = aLong;
                        j++;
                    }
                    else {
                        count ++;
                    }
                }
                arr=tempArray;
            }
        }
        return count;
    }
    public int find(long skey)
    {
        int ne=0;
        for(int i=0;i<siz;i++)
        {
            if (arr[i]==skey)
            {
                ne=i;
                break;
            }


        }
        return ne;
    }


    public long getElem(int index)
    {
        return (arr[index]);
    }
    public boolean delete(long value){
        //deletes the number if present and returns true

        boolean condition = false;
        boolean check = true;
        for(int i=0;i<arr.length;i++){
            if(Objects.equals(value,arr[i])){// object needs to be imported to compare or we can use== also
                condition=true;
                Long[] tempArray = new Long[arr.length];
                int j = 0;
                for (Long aLong : arr) {
                    if(check) {
                        if (!Objects.equals(value, aLong)) {
                            tempArray[j] = aLong;
                            j++;

                        }
                        else {
                            check = false;
                        }
                    }
                    else {
                        tempArray[j] = aLong;
                        j++;
                    }
                }
                arr=tempArray;
            }
        }
        return condition;
    }
    public void disp()
    {
        for(int i=0;i<siz;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
class SortingTech extends Mylongarray
{
    SortingTech(int size) {
        super(size);
    }
    public void bubblesort()
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    long temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }

    }
    public void  selectionsort()
    {
        long min;
        for(int i=0;i<arr.length;i++)
        {
            min=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<min)
                {
                    long temp;
                    min=arr[j];
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public void insertionsort()
    {
        int j;
        for(int i=1;i< arr.length;i++)
        {
            long temp=arr[i];
            j=i;
            while(j>0 && arr[j-1]>=temp)
            {
                arr[j]=arr[j-1];
                --j;
            }
            arr[j]=temp;
        }
    }
    public void init()
    {
        for(int i=0;i<arr.length;i++)
        {
            long randoml=new Random().nextLong(); // this is how we use random and then use nexttype to get random numbers
            insert(randoml);// here we used insert function  to insert the random long values
        }
    }

}