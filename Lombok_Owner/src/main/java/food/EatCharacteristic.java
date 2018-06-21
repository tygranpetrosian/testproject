package food;

import enumerations.CatPosition;
import enumerations.DayPart;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderMethodName = "createCharacteristic", buildMethodName = "foodCollector")
public class EatCharacteristic {
    private double amountFoodEaten;
    private DayPart dayPart;
    private CatPosition catPosition;

}
