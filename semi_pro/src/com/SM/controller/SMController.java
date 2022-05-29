package com.SM.controller;

import com.SM.dao.SMDAO;
import com.SM.vo.SMAVO;
import com.SM.vo.SMCVO;

//Stock Manager Controller
public class SMController {
	private SMDAO DataCon = new SMDAO();
	
	// SMCVO에 연결되는 기능
	public boolean view(SMCVO data) {
		return DataCon.view(data);
	}
	
	public boolean regi(SMCVO data) {
		return DataCon.regi(data);
	}
	
	public boolean modi(SMCVO data) {
		return DataCon.modi(data);
	}
	
	public boolean Calculate(SMCVO data) {
		return DataCon.Calculate(data);
	}
	
	
	
	// SMAVO 에 연결되는 기능
	public boolean join(SMAVO data) {
		SMAVO account = DataCon.get(data.getID());
		
		if(account != null) {
			return false;
		}
		
		boolean result = DataCon.register(data);
		return result;
	}
	
	public boolean update(SMAVO data) {
		return DataCon.update(data);
	}
	
	public boolean remove(SMAVO data) {
		return DataCon.remove(data);
	}
	
	public SMAVO login(String ID, String PASSWORD) {
		SMAVO data = DataCon.get(ID);
		
		if(data.getPASSWORD().equals(PASSWORD)) {
			return data;		
		} 
		return null;
	}
}
