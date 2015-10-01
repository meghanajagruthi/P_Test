package com.Plash.DAO;

import java.util.ArrayList;

import com.Plash.POJO.Pojo;

public interface Dao {

	public void insertData(Pojo pojo);
	public ArrayList<Pojo> getAllRecords();
	
}
