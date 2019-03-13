import java.util.Random;

public class Quick{

/*return the value that is the kth smallest value of the array. k=0 is the smallest
*/
public static int quickselect(int[] data, int k) {
   int returnIndex = partition(data,0,data.length-1);
   while (k != returnIndex) {
     //System.out.println("r" + returnIndex);
     if (k < returnIndex) {
       returnIndex = partition(data,0,returnIndex);
     }
     else {
       returnIndex = partition(data,returnIndex,data.length-1);
     }
   }
   return data[k];
}

/*Modify the array to be in increasing order.
*/
public static void quicksort(int[] data) {

}

public static int partition (int [] data, int start, int end) {

    Random r = new Random();
    int starter = start;
    int ender = end;
    int pivot = r.nextInt(data.length-1);
    int storage;

    storage = data[pivot];
    data[pivot] = data[starter];
    data[starter] = storage;
    start++;
    while (start != end) {
      if (data[start] > data[starter]) {
        storage = data[start];
        data[start] = data[end];
        data[end] = storage;
        end--;
      }
      else {
        start++;
      }
    }

    if (data[start] < data[starter]) {
      storage = data[start];
      data[start] = data[starter];
      data[starter] = storage;
      return start;
    }
    else {
      storage = data[start-1];
      data[start-1] = data[starter];
      data[starter] = storage;
      return start-1;
    }

  }

}
