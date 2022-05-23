package edu.sample.usda_api_object;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Nutrient {
    private int nutrientId;
    private String nutrientName;
    private String nutrientNumber;
    private String unitName;
    private String derivationCode;
    private String derivationDescription;
    private int derivationId;
    private float value;
    private int foodNutrientSourceId;
    private String foodNutrientSourceCode;
    private String foodNutrientSourceDescription;
    private int rank;
    private int indentLevel;
    private int foodNutrientId;
    private int percentDailyValue;
}
