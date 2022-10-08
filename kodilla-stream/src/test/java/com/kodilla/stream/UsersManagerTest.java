package com.kodilla.stream;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    private UsersManager usersManager = new UsersManager();

    @Test
    public void filterChemistGroupUsernamesTest() {
        List<String> result = usersManager.filterChemistGroupUsernames();
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");
        assertEquals(expectedList, result);
    }

    @Test
    public void getHigherAgeTest() {
        List<User> result = usersManager.getHigherAge(45);
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Gus Firing", 49, 0, "Board"));
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedList, result);
    }

    @Test
    public void getNumberOfPostsAndGroupFilterTest() {
        List<User> result = usersManager.getNumberOfPostsAndGroupFilter(2, "Chemists");
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        assertEquals(expectedList, result);
    }
}