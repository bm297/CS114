import java.util.HashMap;

//********************************************************************
//  StaffMember.java       Author: Lewis/Loftus
//
//  Represents a generic staff member.
//********************************************************************

public class StaffEmployee
{
   protected String name;
   protected String address;
   protected String phone;
   protected String SocialSec;
   protected Double Rate;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this staff member using the specified
   //  information.
   //-----------------------------------------------------------------

    public StaffEmployee (String eName, String eAddress, String ePhone, String eSocialSec, Double eRate)
   {
      this.name = eName;
      this.address = eAddress;
      this.phone = ePhone;
      this.SocialSec = eSocialSec;
      this.Rate = eRate;
   }

   public String getEmployeeId()
	{
		return SocialSec;
	}

   //-----------------------------------------------------------------
   //  Returns a string including the basic employee information.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "Name: " + name + "\n";

      result += "Address: " + address + "\n";
      result += "Phone: " + phone;

      return result;
   }
}