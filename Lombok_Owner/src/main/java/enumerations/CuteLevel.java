package enumerations;

import org.apache.commons.lang3.StringUtils;

public enum CuteLevel {
    BAD_CAT,
    FAT_CAT;

    public String toString() {
        return StringUtils.upperCase(StringUtils.replaceAll(name(), "_", " "));
    }
}
