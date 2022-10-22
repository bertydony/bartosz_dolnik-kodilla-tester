import com.kodilla.collections.adv.exercises.homework.Flight;
import com.kodilla.collections.adv.exercises.homework.FlightFinder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTest {
    private FlightFinder flightFinder = new FlightFinder();

    @Test
    public void testFlightsFrom(){
        List<Flight> result = flightFinder.findFlightsFrom("Wieden");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Wieden", "Berlin"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFlightsTo(){
        List<Flight> result = flightFinder.findFlightsTo("Berlin");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Wieden", "Berlin"));
        assertEquals(expectedList, result);
    }


}
