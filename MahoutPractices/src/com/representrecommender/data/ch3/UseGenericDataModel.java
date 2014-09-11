package com.representrecommender.data.ch3;

import org.apache.mahout.cf.taste.impl.common.FastByIDMap;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.GenericUserPreferenceArray;
import org.apache.mahout.cf.taste.model.PreferenceArray;

public class UseGenericDataModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastByIDMap<PreferenceArray> map=new FastByIDMap<PreferenceArray>();
		
		PreferenceArray user1Array=new GenericUserPreferenceArray(5);
		
		user1Array.setUserID(0, 1);
		user1Array.setItemID(0, 101);
		user1Array.setValue(0, 1.02f);
		
		user1Array.setItemID(1, 102);
		user1Array.setValue(1, 2.5f);
		
		user1Array.setItemID(2, 103);
		user1Array.setValue(2, 3.0f);
		
		user1Array.setItemID(3, 104);
		user1Array.setValue(3, 4.1f);
		
		user1Array.setItemID(4, 105);
		user1Array.setValue(4, 5.0f);
		
		
		PreferenceArray user2Array=new GenericUserPreferenceArray(5);
		
		user2Array.setUserID(0, 2);
		user2Array.setItemID(0, 101);
		user2Array.setValue(0, 1.12f);
		
		user2Array.setItemID(1, 102);
		user2Array.setValue(1, 3.5f);
		
		user2Array.setItemID(2, 103);
		user2Array.setValue(2, 1.0f);
		
		user2Array.setItemID(3, 104);
		user2Array.setValue(3, 4.1f);
		
		user2Array.setItemID(4, 105);
		user2Array.setValue(4, 0.0f);
		
		
		map.put(1L, user1Array);
		map.put(2L, user2Array);
		
		System.out.println(map);
		
		LongPrimitiveIterator iterator=map.keySetIterator();
		while(iterator.hasNext())
		{
			Long key=iterator.next();
//			System.out.println(key);
			PreferenceArray out=map.get(key);
			System.out.println(out);
		}
		
		
	}

}
