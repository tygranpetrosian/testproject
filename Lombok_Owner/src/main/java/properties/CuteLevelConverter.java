package properties;

import enumerations.CuteLevel;
import org.aeonbits.owner.Converter;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;

public class CuteLevelConverter implements Converter {
    public CuteLevel convert(Method targetMethod, String text) {
        if (StringUtils.endsWithIgnoreCase(text, "bad cat")) {
            return CuteLevel.BAD_CAT;
        } else if (StringUtils.endsWithIgnoreCase(text, "fat cat")) {
            return CuteLevel.FAT_CAT;
        } else {
            throw new RuntimeException("Such cute level is not exist.");
        }
    }
}
