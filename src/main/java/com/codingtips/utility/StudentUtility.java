package com.codingtips.utility;

import com.codingtips.model.Student;

public interface StudentUtility {
	
	public static void calculateDtls(Student s)
	{
		var fee=s.getStudFee();
		var disc=fee*10/100;
		var gst=fee*12/100;
		
		s.setStudFeeDisc(disc);
		s.setStudFeeGst(gst);
	}

}
