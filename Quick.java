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
  public static void insertionSort(int[] data) {
  int storage = 0;                                                                      //still can't instantiate ints without a value
  for (int x = 1; x < data.length; x++) {                                               //start at 1, as a size 1 array is already sorted, and should be comparing to that at the start
    if (data[x] < data[x-1]) {                                                         //checks if the element needs to be placed inside the sorted(greater value is sorted already on the rightmost of the array)
      storage = data[x];                                                                //stores the value
      //System.out.println(storage);                                                    //testing
      int c = x;                                                                        //since this loop looks at the left value to compare, it would need to start at the stored value
      while (c > 0 && (data[c-1] > storage)) {                                          //this checks if there is a need to shift the value over to the next one, if it's 0 then you can't shift anymore
        data[c] = data[c-1];                                                            //this shifts the left value to the current position(this value is already saved by storage and in later cases the old in the new position is irrelevant as it is moved out already)
        c--;                                                                            //increment that was forgotten in one version
        //System.out.println(toString(data));                                           //testing for terrbile loops
      }
      data[c] = storage;                                                                //once the correct position is reached, the stored value is placed there
      /*  OLD LOOP
      for(int sorted = x-1; sorted > -1; sorted--) {                                    //counts backwards from the "sorted array"
        if (storage < data[sorted]) {                                                  //if the element is greater than the stored (need to be sorted), then shift over
          data[sorted+1] = data[sorted];
          if (sorted == 0) {                                                           //issue was that it would not be able to set the lowest value all the way at the beginning, it would only duplicate the original value at the start to the next position
            data[sorted] = storage;
          }
          //System.out.println(toString(data));                                         //test
          //System.out.println("less");                                                 //test
        }
        else if (storage >= data[sorted]){ //here probably issue                        //This checked the remaining cases, even though an else would probably suffice
          data[sorted+1] = storage;                                                     //the duplicate would be overwritten
          sorted = -1;                                                                  //makes sure loop ends
          //storage = 0;                                                                //thought this might've actually done something, but just varying amounts of duplicates in failed cases threw me off
          //System.out.println(toString(data));
          //System.out.println("more");
        }
        */
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
    else if (data.length < 100) {
      insertionSort(data);
    }
    else {
      int pivot = partition(data,low,high);
      quicksortH(data,low,pivot-1);
      quicksortH(data,pivot+1,high);
    }
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
