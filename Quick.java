import java.util.Random;

public class Quick{

/*return the value that is the kth smallest value of the array. k=0 is the smallest
*/
public static int quickselect(int[] data, int k) {
  
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

    for (int x = starter+1; x < data.length ; x++) {
      if (x == ender) {
        if (data[x] <= data[starter]) {
          storage = data[x];
          data[x] = data[starter];
          data[starter] = storage;
          return x;
        }
        else {
          storage = data[x-1];
          data[x-1] = data[starter];
          data[starter] = storage;
          return x-1;
        }

      }
      if (data[x] > data[starter]) {
        storage = data[ender];
        data[ender] = data[x];
        data[x] = storage;
        ender--;
        x--;
      }

    }
    return -1;
  }

}
