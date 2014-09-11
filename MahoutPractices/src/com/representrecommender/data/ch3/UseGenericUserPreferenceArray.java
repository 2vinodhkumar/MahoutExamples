package com.representrecommender.data.ch3;

import org.apache.mahout.cf.taste.impl.model.GenericUserPreferenceArray;
import org.apache.mahout.cf.taste.model.PreferenceArray;

public class UseGenericUserPreferenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreferenceArray array=new GenericUserPreferenceArray(2);
		
		array.setUserID(0,14);
		array.setItemID(0, 101);
		array.setValue(0, 2.6f);
		
		array.setItemID(1, 102);
		array.setValue(1, 3.2f);
		
		System.out.println(array);
	}

}
