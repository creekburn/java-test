package edu.sample.usda_api_object;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResponse {
    private int totalHits;
    private int currentPage;
    private int totalPages;
    private int[] pageList;
    private FoodSearchCriteria foodSearchCriteria;
    private List<Food> foods;
    @JsonIgnore
    private Object aggregations;

    @Data
    public static class FoodSearchCriteria {
        private String query;
        private String generalSearchInput;
        private int pageNumber;
        private int numberOfResultsPerPage;
        private int pageSize;
        private boolean requireAllWords;
    }

    @Data
    public static class Aggregations {
        private DataType dataType;
        @JsonIgnore
        private Object nutrients;

        @Data
        public static class DataType {
            private int Branded;
            @JsonProperty("SR Legacy")
            private int SRLegacy;
            @JsonProperty("Survey (FNDDS)")
            private int SurveyFNDDS;
            private int Foundation;
        }
    }
}
