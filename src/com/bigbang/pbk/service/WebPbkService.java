package com.bigbang.pbk.service;

import java.util.ArrayList;

import com.bigbang.pbk.dao.WebPbkDAO;
import com.bigbang.pbk.vo.WebPbkVO;

public class WebPbkService {

	public WebPbkVO login(String id, String pw) {
		WebPbkVO person = new WebPbkDAO().login(id, pw);
		
		return person;
	}
	
	
	public ArrayList<WebPbkVO> selectAll(){
		ArrayList<WebPbkVO> people = new WebPbkDAO().selectAll();
		
		return people;
	}
	
	public ArrayList<WebPbkVO> selectAll(String id){
		ArrayList<WebPbkVO> people = new WebPbkDAO().selectAll(id);
		
		return people;
	}
	
	
	public WebPbkVO updatePbk(WebPbkVO person) {
		WebPbkDAO wDao = new WebPbkDAO();
	    wDao.update(person);
		
		return person;
	}
	
	public void insert(WebPbkVO person) {
		WebPbkDAO wDao = new WebPbkDAO();
		wDao.insert(person);
	}
	
	public void insertPbk(WebPbkVO person) {
		WebPbkDAO wDao = new WebPbkDAO();
		wDao.insertPbk(person);
	}
	
	public void update(WebPbkVO person) {
		WebPbkDAO wDao = new WebPbkDAO();
		wDao.update(person);
	}
	
	public WebPbkVO selectById(String id) {
		WebPbkVO person = null;
		WebPbkDAO wDao = new WebPbkDAO();
		person = wDao.selectById(id);
		
		return person;
	}
	
	
//	public void updateLogin(WebPbkVO person) {
//		WebPbkDAO wDao = new WebPbkDAO();
//		wDao.updateLogin(person);
//		
//	}

	
}