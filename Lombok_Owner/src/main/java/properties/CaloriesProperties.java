package properties;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:calories.properties")
public interface CaloriesProperties extends Config {
    @Key("fish")
    double fishCalories();

    @Key("lamb")
    double lambCalories();

    @Key("chicken")
    double chickenCalories();

    @Key("beef")
    double beefCalories();

    @Key("pork")
    double porkCalories();

}
