package Semana3_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameList {
  public static void main(String[] args) {
  String [] nombres  = {"Dante", "Kattya", "Daniel"};

  List<String> listaNombres = new ArrayList<>(Arrays.asList(nombres));
  listaNombres.add("Domitila");
  listaNombres.remove(3);
  // listaNombres.size();
  listaNombres.equals("Daniel");
  System.out.println(listaNombres);
  System.out.println(listaNombres.size());
  System.out.println(listaNombres.contains("Daniel"));

  for (String n: listaNombres) {
    System.out.println(n);
  }

  listaNombres.add(3, "Lucia");
  System.out.println(listaNombres);

  listaNombres.set(2, "Domenico");
  System.out.println(listaNombres);
  }
}

