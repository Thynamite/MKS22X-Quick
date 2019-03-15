import java.util.Random;
import java.util.*;

public class Driver {

  public static void main(String[]args){
System.out.println("Size\t\tMax Value\tquick/builtin ratio ");
int[]MAX_LIST = {1000000000,500,10};
for(int MAX : MAX_LIST){
  for(int size = 31250; size < 2000001; size*=2){
    long qtime=0;
    long btime=0;
    //average of 5 sorts.
    for(int trial = 0 ; trial <=5; trial++){
      int []data1 = new int[size];
      int []data2 = new int[size];
      for(int i = 0; i < data1.length; i++){
        data1[i] = (int)(Math.random()*MAX);
        data2[i] = data1[i];
      }
      long t1,t2;
      t1 = System.currentTimeMillis();
      Quick.quicksort(data2);
      t2 = System.currentTimeMillis();
      qtime += t2 - t1;
      t1 = System.currentTimeMillis();
      Arrays.sort(data1);
      t2 = System.currentTimeMillis();
      btime+= t2 - t1;
      if(!Arrays.equals(data1,data2)){
        System.out.println("FAIL TO SORT!");
        System.exit(0);
      }
    }
    System.out.println(size +"\t\t"+MAX+"\t"+1.0*qtime/btime);
  }
  System.out.println();
}
}

  /*
  public static void main(String[] args) { //0,2,5,10,15,23
    int[] listy = {10000000, 500, 10};
    for (int x : listy ) {
      for (int size = 31250; size < 2000001; size*=1 ) {
        for (int t = 0; t < 5; t++) {
          int[] d1 = new int[size];
          int[] d2 = new int[size];
          int[] p1 = new int[size];
          int[] p2 = new int[size];
          for (int i = 0; i < d1.length; i++) {
            d1[i] = (int)(Math.random()*x);
            d2[i] = d1[i];
          }
          Arrays.sort(d2);
          for (int k =0; k < d1.length; k ++) {
            if (!(Quick.quickselect(d1,k) == d2[k] )) {
              System.out.println("quickselect " + k);
            }
          }

        }
      }
    }
    */
    /*
    public static void main(String[] args) {
          int[]ary = { 2, 10, 15, 23, 0,  5, 12,21,212,123};  //sorted :  {0,2,5,10,12,15,21,23,123,212}
          int[]arry = new int[100000];
          for (int x = 0; x < arry.length; x++) {
            arry[x] = 1;
          }
          for (int y = 0; y < 100001; y++) {
            System.out.println(Quick.quickselect(arry,y));
          }
          /*
      System.out.println(Quick.quickselect( ary , 0 )); //would return 0
      System.out.println(Quick.quickselect( ary , 1 ));  //would return 2
      System.out.println(Quick.quickselect( ary , 2 ));  //would return 5
      System.out.println(Quick.quickselect( ary , 3 ));  //would return 10
      System.out.println(Quick.quickselect( ary , 4 ));  //would return 12
      System.out.println(Quick.quickselect( ary , 5 ));  //would return 15

      System.out.println(Quick.quickselect( ary , 6 ));  //would return 21
      System.out.println(Quick.quickselect( ary , 7 ));  //would return 23
      System.out.println(Quick.quickselect( ary , 8 ));  //would return 123
      System.out.println(Quick.quickselect( ary , 9 ));  //would return 212
      */

//System.out.println(Quick.partition(ary,0,ary.length-1));
/*
String me = "";
for (int x = 0; x < ary.length;x++) {
  me += ary[x] + " ";
}

System.out.println(me);
*/


}
