public class QuickSort{
    int findPivotIndex(int low,int high,int[] array){
        int pivot=array[high];
        int ind=low-1;
        for(int i=low;i<high;i++){
            if(array[i]<pivot){
                ind++;
                int temp=array[ind];
                array[ind]=array[i];
                array[i]=temp;
            }
        }
        ind++;
        int temp=array[ind];
        array[ind]=pivot;
        array[high]=temp;
        return ind;
    }
    public void sort(int low,int high,int[] array){
        if(low<high){
            int ind=findPivotIndex(low, high, array);
            sort(low,ind-1,array);
            sort(ind+1,high,array);
        }
    }
    public static void main(String[] args){
        int[] array={9,6,45,6,4,567,7345,66};
        for(Integer i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        QuickSort qs=new QuickSort();
        qs.sort(0,array.length-1,array);
        for(Integer i:array){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}


/*
 * result
 * 9 6 45 6 4 567 7345 66 
 * 4 6 6 9 45 66 567 7345 
 */