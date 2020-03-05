package com.ustglobal.phonesimulator.dao;


import java.util.List;
import com.ustglobal.phonesimulator.dto.PhoneBean;

public interface PhoneDao{

	public List<PhoneBean>showAllContacts();
	public PhoneBean searchContact(String name);
	public int addContact(PhoneBean bean);
	public int deleteContact(PhoneBean bean);
	public int editContact(PhoneBean bean);


}