/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.sample;

import edu.sample.usda_api_object.Food;
import edu.sample.usda_api_object.SearchResponse;

public class Exercises {
    /**
     * Implement this method to figure out expected page sizes.
     * @param totalHits Total number of results from a search.
     * @param pageSize The page size that will be used.
     * @return Total number of pages.
     */
    public int calculateTotalPages(int totalHits, int pageSize) {
        return 0;
    }

    /**
     * Look through all the foods in the SearchResponse, and return the
     * Food with the oldest `publishedDate`.
     * @param response Response from the usda search API.
     * @return Food with oldest `publishDate` from the response.
     */
    public Food findFoodByOldestPublishedDate(SearchResponse response) {
        return null;
    }

    /**
     * For Each Food in SearchResponse that has a `servingSizeUnit` == 'g',
     * convert the `servingSize` to ounces and change the `servingSizeUnit`
     * field to `oz`.
     *
     * <pre>
     *     # Formula to convert grams to ounces
     *     grams / 28.34952 = ounces
     * </pre>
     *
     * It is acceptable to modify the incoming SearchResponse and return it.
     *
     * @param response Response from the usda search API.
     * @return Response from the usda search API.
     */
    public SearchResponse convertServingSizeFromGramsToOunces(SearchResponse response) {
        return response;
    }
}
