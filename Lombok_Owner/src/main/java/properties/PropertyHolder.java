package properties;

import org.aeonbits.owner.ConfigFactory;

public class PropertyHolder {
    public CaloriesProperties caloriesProperties = ConfigFactory.create(CaloriesProperties.class);
    public CuteLevelProperties cuteLevelProperties = ConfigFactory.create(CuteLevelProperties.class);
}
