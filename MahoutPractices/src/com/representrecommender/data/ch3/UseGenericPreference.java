package com.representrecommender.data.ch3;

import org.apache.mahout.cf.taste.impl.model.GenericPreference;

public class UseGenericPreference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//GenericPreference is implementation of Preference interface args=userID,ItemID,preference value
		System.out.println(new GenericPreference(1, 101, 3.2f));
		
	}

}
