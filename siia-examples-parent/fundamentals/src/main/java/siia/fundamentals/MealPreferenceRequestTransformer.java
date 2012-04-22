package siia.fundamentals;

import org.springframework.xml.transform.StringSource;

import javax.xml.transform.Source;

public class MealPreferenceRequestTransformer {

  public String buildMealPreferenceUpdateRequest(MealPreference
                                                     mealPreference) {
    return new String(
        "<updateMealPreference>" +
            "<flightRef>" +
               mealPreference.getFlightReference() +
            "</flightRef>" +
            "<mealPreference>" +
               mealPreference + "" +
            "</mealPreference>" +
        "</updateMealPreference>");
  }
}
