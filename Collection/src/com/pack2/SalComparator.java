package com.pack2;

import java.util.Comparator;

public class SalComparator  implements Comparator<Emp> {

	public int compare(Emp e1, Emp e2) {
         Double str1=e1.getSal();
         Double str2= e2.getSal();
         return str1.compareTo(str2);
	}

}
