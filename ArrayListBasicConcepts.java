  // -- Ye Toh Mai Revision  Kar raha hu 

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList{
  public static void main(String [] args){
    ArrayList<Integer> list = new ArrayList<>();

  // add element in Array 

  list.add(0);
  list.add(1);
  list.add(4);

  System.out.println(list);

  //  Agr Humme Kisi Bhi Index Ki value pata Karni Ho use this -- 

  int element = list.get(0);

  System.out.println(element);

  // 
  for (int i = 0 ; i < list.size();i++){
    System.out.println(list.get(i));
  }
    System.out.println();



  // 
  list.set(1,1);
  System..out.println(list);

  // remove--
  list.remove(1);

  System.out.println(list);



  
