package com.max;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


@Path("/modi")	
public class RequestHendler {
	@POST
   	@Path("ok")
     public String getString(@QueryParam("str") String str ) {
		
	 return str.toLowerCase();
    }
	
	@POST
   	@Path("add")
     public String getadd(@QueryParam("n1") int n1,@QueryParam("n2") int n2  ) {
	 return "added is "+(n1-n2);
    }
	@POST
	@Path("fact")
	public String getFacto(@QueryParam("no")   int no)
	{  int f=1;
		 for(int i=no;i>1;i--)
		 {
			 f=f*i;
		 }
		return "Result is "+f;
	}
	@POST
	@Path("otp")
	public String getOtp(@QueryParam("mob")  String mob)
	{  
		if(mob.length()==10)
		{
		return "OTP is "+mob.substring(3, 9);
		}
		else
		{
			return "invalid Nom";
		}
	}
}
