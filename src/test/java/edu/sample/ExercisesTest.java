/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.sample;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.sample.usda_api_object.Food;
import edu.sample.usda_api_object.SearchResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ExercisesTest {
    private static ObjectMapper MAPPER;
    @BeforeAll
    static void beforeAll() {
        MAPPER = new ObjectMapper();
        MAPPER.findAndRegisterModules();
    }

    private SearchResponse searchResponse;

    private Exercises exercises;

    @BeforeEach
    void beforeEach() throws IOException {
        searchResponse = MAPPER.readerFor(SearchResponse.class)
                .readValue(getClass().getClassLoader().getResource("search-apple.json"));

        exercises = new Exercises();
    }

    @Test void searchResponseReadCorrectly() {
        assertNotNull(searchResponse, "There was a problem reading `search-apple.json` into the tests.");
    }

    @Test void calculateTotalPages() {
        int totalPages = exercises.calculateTotalPages(22627, 20);
        assertEquals(1132, totalPages, "Total Pages was not the expected result.");
    }

    @Test void findFoodByOldestPublishedDate() {
        Food food = exercises.findFoodByOldestPublishedDate(searchResponse);
        assertNotNull(food, "Expected `findFoodByOldestPublishedDate` to return a Food object.");
        assertEquals(174988, food.getFdcId(), "Expected to find 1 Food that is oldest.");
    }

    @Test void convertServingSizeFromGramsToOunces() {
        SearchResponse response = exercises.convertServingSizeFromGramsToOunces(searchResponse);
        assertEquals("oz", response.getFoods().get(0).getServingSizeUnit(), "Expected Food(fdcId=454004) to have servingSizeUnit == \"oz\"");
        assertEquals(5.432f, response.getFoods().get(0).getServingSize(), 0.001, "Expected Food(fdcId=454004) to have servingSize == 5.432");
        assertEquals("oz", response.getFoods().get(2).getServingSizeUnit(), "Expected Food(fdcId=2124902) to have servingSizeUnit == \"oz\"");
        assertEquals(8.536f, response.getFoods().get(2).getServingSize(), 0.001, "Expected Food(fdcId=2124902) to have servingSize == 8.536");
    }
}