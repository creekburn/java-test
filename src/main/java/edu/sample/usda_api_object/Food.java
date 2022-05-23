package edu.sample.usda_api_object;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Food {
    private int fdcId;
    private String description;
    private String lowercaseDescription;
    private String dataType;
    private String gtinUpc;
    private LocalDate publishedDate;
    private String brandOwner;
    private String ingredients;
    private String marketCountry;
    private String foodCategory;
    private LocalDate modifiedDate;
    private String dataSource;
    private String servingSizeUnit;
    private float servingSize;
    private String householdServingFullText;
    private String allHighlightFields;
    private float score;
    private List<Nutrient> foodNutrients;
    @JsonIgnore
    private Object[] finalFoodInputFoods;
    @JsonIgnore
    private Object[] foodMeasures;
    @JsonIgnore
    private Object[] foodAttributes;
    @JsonIgnore
    private Object[] foodAttributeTypes;
    @JsonIgnore
    private Object[] foodVersionIds;
}
