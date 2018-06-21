package properties;

import enumerations.CuteLevel;
import org.aeonbits.owner.Config;

@Config.Sources("classpath:cute_level.properties")
public interface CuteLevelProperties extends Config {
    @Key("good")
    @ConverterClass(CuteLevelConverter.class)
    CuteLevel good();

    @Key("bad")
    @ConverterClass(CuteLevelConverter.class)
    CuteLevel bad();
}
