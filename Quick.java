import java.util.Random;

public class Quick{

/*return the value that is the kth smallest value of the array. k=0 is the smallest
*/

public static int quickselect(int[] data, int k) {
  int s = 0;
  int e = data.length-1;
  int index = partition(data,s,e);
  while (k != index) {
    System.out.println(index);
    if (k > index) {
      s = index+1;
      index = partition(data,index+1,e);
    }
    else {
      e = index-1;
      index = partition(data,s,index-1);
    }
  }
  return data[index];
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
    System.out.println("pivot " + pivot);
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
