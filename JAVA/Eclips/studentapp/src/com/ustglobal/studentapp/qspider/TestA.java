package com.ustglobal.studentapp.qspider;

//import com.ustglobal.studentapp.jspider.Angular; Fully Qualified
//import com.ustglobal.studentapp.jspider.React;

import com.ustglobal.studentapp.jspider.*;

public class TestA {
	public static void main(String[] args) {
		QTP q = new QTP();
		q.teachQtp();

		Selenium s = new Selenium();
		s.teachSelenium();

		//	com.ustglobal.studentapp.jspider.Angular a = new com.ustglobal.studentapp.jspider.Angular();
		//	com.ustglobal.studentapp.jspider.Angular b = new com.ustglobal.studentapp.jspider.Angular();

		Angular a = new Angular(); 
		React r = new React();
		r.teachReact();
		a.teachAngular();
	}

}
