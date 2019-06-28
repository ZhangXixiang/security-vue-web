package com.space.common.lp.util;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Comparator;


public class CustomTreeMapComparator<T> implements Comparator<T> {

	Collator collator=Collator.getInstance();

	public int compare(T t1 ,T t2) {
		CollationKey key1 = collator.getCollationKey(t1.toString());
		CollationKey key2 = collator.getCollationKey(t2.toString());
		
		return key1.compareTo(key2);
	}

 


}
