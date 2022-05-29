package com.md.ctrl;

import com.md.MDAccount_t;
import com.md.MDControl_t;

public class ManageControl {
	
	private DataControl DataCon = new DataControl();
	
	public boolean join(MDAccount_t data) {
		MDAccount_t account = DataCon.get(data.getID());
		
		if(account != null) {
			return false;
		}
		
		boolean result = DataCon.register(data);
		return result;
	}
	
	public boolean update(MDAccount_t data) {
		return DataCon.update(data);
	}
	
	public boolean remove(MDAccount_t data) {
		return DataCon.remove(data);
	}
	
	public MDAccount_t login(String ID, String PASSWORD) {
		MDAccount_t data = DataCon.get(ID);
		
		if(data.getPASSWORD().equals(PASSWORD)) {
			return data;		
		}
		return null;
	}
	
//	public boolean view(MDControl_t data); {
//		return DataCon.view(data);
//	}
}
