package locs.service;

import java.util.List;

import locs.model.LocsDAO;
import locs.model.LocsDTO;

public class LocsService {
private LocsDAO dao;
	
	public LocsService() {
		dao = new LocsDAO();
	}

	public List<LocsDTO> getAll() {
		List<LocsDTO> datas = dao.searchAll();
		return datas;
	}
	
	public LocsDTO getId(String id) {
		return _getId(Integer.parseInt(id));
	}
	
	public LocsDTO getId(int id) {
		return _getId(id);
	}
	
	public LocsDTO getId(LocsDTO locsDto) {
		return _getId(locsDto.getLocId());
	}
	
	private LocsDTO _getId(int id) {
		LocsDTO data = dao.searchId(id);
		return data;
	}
	
	public LocsDTO addLoc(String locId, String stAddr, String postal, String city, String state, String ctyId) {
		dao = new LocsDAO();
		
		LocsDTO locsDto = null;
		if(locId.matches("\\d+") && postal.matches("\\d+") && ctyId.matches("\\d+")) {
			locsDto = new LocsDTO();
			locsDto.setLocId(Integer.parseInt(locId));
			locsDto.setStAddr(stAddr);
			locsDto.setPostal(postal);
			locsDto.setCity(city);
			locsDto.setState(state);
			locsDto.setCtyId(ctyId);
			
			if(dao.searchId(locsDto.getLocId()) != null) {
				locsDto.setLocId(-1);
				dao.rollback();
				dao.close();
				return locsDto;
			}
			/*
			if(!dao.existPostal(locsDto.getPostal())) {
				locsDto.setPostal(-1);
				dao.rollback();
				dao.close();
				return locsDto;
			}
			
			if(!dao.existCtyId(locsDto.getCtyId())) {
				locsDto.setCtyId(-1);
				dao.rollback();
				dao.close();
				return locsDto;
			}
			*/
			boolean isSaved = dao.insertLocs(locsDto);
			
			if(!isSaved) {
				dao.rollback();
				dao.close();
				return null;
			}
		}
		
		dao.commit();
		dao.close();
		return locsDto;
	}
	
	public int modifyLocs(LocsDTO data) {
		dao = new LocsDAO();
		
		if(!dao.existPostal(data.getPostal())) {
			dao.rollback();
			dao.close();
			return -1;
		}
		
		if(!dao.existCtyId(data.getCtyId())) {
			dao.rollback();
			dao.close();
			return -2;
		}
		
		boolean isSaved = dao.updateLocs(data);
		
		if(isSaved) {
			dao.commit();
			dao.close();
			return 1;
		}
		dao.rollback();
		dao.close();
		return 0;
	}

	public int deleteLocs(String id) {
		dao = new LocsDAO();
		
		if(dao.searchId(Integer.parseInt(id)) == null) {
			dao.rollback();
			dao.close();
			return -1;	// 삭제 대상이 없음을 알림 (이미 삭제됨.)
		}
		
		boolean result = dao.deleteLocs(Integer.parseInt(id));
		if(result) {
			dao.commit();
			dao.close();
			return 1;
		}
		dao.rollback();
		dao.close();
		return 0;
	}
}
