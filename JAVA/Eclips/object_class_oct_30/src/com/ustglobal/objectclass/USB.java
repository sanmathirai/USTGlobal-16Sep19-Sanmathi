package com.ustglobal.objectclass;

public class USB {

		public static void connect(Object obj)
		{
			if(obj instanceof Pendrive)
			{
				Pendrive p = (Pendrive)obj ;
				p.read();
				p.write();
			}
			if(obj instanceof Mouse)
			{
				Mouse m = (Mouse)obj ;
				m.scroll();
				m.click();
			}
			else {
				System.out.println("Invalid object");
			}
		}
}
