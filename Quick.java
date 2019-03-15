import java.util.Random;

public class Quick{

/*return the value that is the kth smallest value of the array. k=0 is the smallest
*/

public static int quickselect(int[] data, int k) {

}

private static int quickSelectH(int[] data, int k, int start, int end) {
  int index = partition(data,start,end);
  if (index == k) {
    return data[k];
  }
  else {
    
  }
}
/*Modify the array to be in increasing order.
*/
public static void quicksort(int[] data) {

}

public static int partition (int [] data, int start, int end) {

    Random r = new Random();
    int starter = start;
    int ender = end;
    int pivot = r.nextInt(end-start+1); //this needs to be changed, or updated to median
    int storage;
    //System.out.println("pivot " + pivot);
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
