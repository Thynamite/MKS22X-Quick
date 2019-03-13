public class Driver {

  public static void main(String[] args) { //0,2,5,10,15,23
    int[]ary = { 2, 10, 15, 23, 0,  5};//, 12,21,212,123};  //sorted :  {0,2,5,10,12,15,21,23,123,212}

System.out.println(Quick.quickselect( ary , 0 )); //would return 0
System.out.println(Quick.quickselect( ary , 1 ));  //would return 2
System.out.println(Quick.quickselect( ary , 2 ));  //would return 5
System.out.println(Quick.quickselect( ary , 3 ));  //would return 10
System.out.println(Quick.quickselect( ary , 4 ));  //would return 12
System.out.println(Quick.quickselect( ary , 5 ));  //would return 15
/*
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

}
