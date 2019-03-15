import java.util.Random;

public class Quick{

/*return the value that is the kth smallest value of the array. k=0 is the smallest
*/

  public static int quickselect(int[] data, int k) {
    return quickSelectH(data,k,0,data.length-1);
  }

  private static int quickSelectH(int[] data, int k, int start, int end) {
    int index = partition(data,start,end);
      if (index == k) {
      return data[k];
    }
      else {
      if (index > k) {
        return quickSelectH(data, k, start, index);
      }
      else {
        return quickSelectH(data,k,index,end);
      }
    }
  }
/*Modify the array to be in increasing order.
*/
  public static void quicksort(int[] data) {
    quicksortH(data,0,data.length-1);
  }

  private static void quicksortH(int[] data, int low, int high) {
    if (low >= high) {
      return;
    }
    int pivot = partition(data,low,high);
    quicksortH(data,low,pivot-1);
    quicksortH(data,pivot+1,high);
  }

  private static void swapper(int[] data, int index1, int index2) {
    int storage = data[index1];
    data[index1] = data[index2];
    data[index2] = storage;
  }
  public static int partition (int [] data, int start, int end) {

    Random r = new Random();
    int starter = start;
    int ender = end;
    int pivot1 = r.nextInt(end-start+1) +start;
    int pivot2 = r.nextInt(end-start+1) +start;
    int pivot3 = r.nextInt(end-start+1) +start;
    int pivot = median(pivot1,pivot2,pivot3);
    //System.out.println("pivot " + pivot);
    swapper(data,pivot,starter);
    start++;
    while (start != end) {
      if (data[start] > data[starter]) {
        swapper(data,start,end);
        end--;
      }
      else if (data[start] == data[starter]) {
        int check = r.nextInt(1);
        if (check == 0) {
          swapper(data,start,end);
          end--;
        }
        else {
          start++;
        }
      }
      else {
        start++;
      }
    }

    if (data[start] < data[starter]) {
      swapper(data,start,starter);
      return start;
    }
    else {
      swapper(data,start-1,starter);
      return start-1;
    }

  }

  private static int median(int f, int s, int t) {
    if ((f >= s && f <= t) || (f <= s && f >= t)) {
      return f;
    }
    if ((s >= f && s <= t) || (s <= f && s >= t)) {
      return s;
    }
    return t;
  }

}
