import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DateTest {

	public static void main(String args[]) throws ParseException {
//		Date currentDate = new Date();		
//
//		Date firstRegistrationDate = new Date();
//		Date promisedTripDate = new Date();
//		Date storageFromDate = new Date();
//		Date storageThroughDate = new Date();
//		Date dateOfLoss = new Date();
//		Date dateCliamReported = new Date();
//		Date holdForPickupDate = new Date();
//		Date saleHoldAuctionDate = new Date();
//		
//		
//		
//		
//		
//		//p.matches(regex, input)
//		//Date validations
//
//		if (firstRegistrationDate != null)
//			if (firstRegistrationDate.after(currentDate))
//				System.out.println("First Registtration date cannot be future date");
//		
//		if (promisedTripDate != null)
//			if (promisedTripDate.before(currentDate))
//				System.out.println("Promised Trip Date cannot be past date");
//
//		if (storageFromDate != null && storageThroughDate != null)
//			if (storageFromDate.after(storageThroughDate))
//				System.out.println("storage Thrugh date must be after storage from date");
//
//		if (dateOfLoss != null)
//			if (dateOfLoss.after(currentDate))
//				System.out.println("Date of Loss cannot be future date");
//
//		if (dateCliamReported != null)
//			if (dateCliamReported.after(currentDate))
//				System.out.println("Date Cliam Reported cannot be future Date");
//
//		if (holdForPickupDate != null)
//			if (holdForPickupDate.before(currentDate))
//				System.out.println("Hold for Pickup Date cannot be past date");
//
//		if (saleHoldAuctionDate != null)
//			if (saleHoldAuctionDate.before(currentDate))
//				System.out.println("Sale Hold Auction Date cannot be pase Date");
//		
//		System.out.println(getDateFromString("2015-08-19T18:46:19 UTC"));
//		

		String input = "smdaksjd";
		String regex = "[^#%<>;]+";
		Boolean b = Pattern.matches(regex,input);
		System.out.println(b);
		

	}

	
	public static Date getDateFromString(String dateString) throws ParseException
	{
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz");
		sf.setLenient(false);
		Date date = sf.parse(dateString);
		return date;
		
	}
}
