package com.productmanagement.model;

import java.util.Comparator;

public class ProductSlugComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		ProductSlug s1 = (ProductSlug) o1;
		ProductSlug s2 = (ProductSlug) o2;

		if (s1.getSequence() == s2.getSequence())
			return 0;
		else if (s1.getSequence() > s2.getSequence())
			return 1;
		else
			return -1;
	}

}
