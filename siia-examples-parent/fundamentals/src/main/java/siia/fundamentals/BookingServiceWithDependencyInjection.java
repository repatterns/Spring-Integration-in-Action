package siia.fundamentals;

import org.springframework.ws.client.core.WebServiceOperations;
import org.springframework.xml.transform.StringResult;
import org.springframework.xml.transform.StringSource;

import javax.xml.transform.Source;

public class BookingServiceWithDependencyInjection {

  private final BookingDao bookingDao;

  public BookingServiceWithDependencyInjection(BookingDao bookingDao) {
    this.bookingDao = bookingDao;
  }

  public MealPreference getFlightRefForBooking(MealPreference mealPreference) {
    Booking booking = bookingDao.getBookingById(
        mealPreference.getBookingReference());
//	System.out.println("");
//	System.out.println(mealPreference);
//	System.out.println("");
    return mealPreference;
  }

}