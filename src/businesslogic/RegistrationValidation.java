package businesslogic;

public class RegistrationValidation{
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		if(email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
			return false;
		}
		boolean pass = isValidPassword(password,confirmPassword);
		boolean mail = isValidMail(email);
		if(mail&&pass) {
			return true;
		}else
			return false;
	}
	
	private boolean isValidPassword(String p,String cp) {
		if(!(p.equals(cp))&&!((p.length()>=8)&&(p.length()<=20)))
			return false;
         char a[]=p.toCharArray();
         int capital=0;
         int lower=0;
         int num=0;
         int special=0;
         for(int i=0;i<p.length();i++)
         {
        	 if((a[i]>=65)&&(a[i]<=90))
        		 capital ++;
        	 else if((a[i]>=97)&&(a[i]<=122))
        		 lower ++;
        	 else if((a[i]>=48)&&(a[i]<=58))
        		 num ++;
        	 else
        		 special ++;
        		 
         }
         if((capital>0)&&(lower>0)&&(num>0))
        	 return true;
		
         else
        	 return false;
		
	}
	private boolean isValidMail(String mail) {
		
         char a[]=mail.toCharArray();
         int capital=0;
         int lower=0;
         int num=0;
         int special=0;
         for(int i=0;i<mail.length();i++)
         {
        	 if((a[i]>=65)&&(a[i]<=90))
        		 capital ++;
        	 else if((a[i]>=97)&&(a[i]<=122))
        		 lower ++;
        	 else if((a[i]>=48)&&(a[i]<=58))
        		 num ++;
        	 else if ((a[i]==64)||(a[i]==46)||(a[i]==95)) {
        		 special ++;
        	 }
        		 
        		 
         }
         if((capital>0)&&(lower>0)&&(num>0)&&(special>0))
        	 return true;
		
         else
        	 return false;
	}
}