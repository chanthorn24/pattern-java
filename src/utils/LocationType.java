package utils;

import constant.LocationConstant;
import java.util.Arrays;

public enum LocationType {

  CAMBODIA("cambodia", LocationConstant.CAMBODIA),
  JAPAN("japan", LocationConstant.JAPAN),
  FRANCE("france", LocationConstant.FRANCE);

  LocationType(String key, String value) {
    this.key = key;
    this.value = value;
  }

  // SETTER
  public String getKey() {
    return key;
  }

  public String getValue() {
    return value;
  }

  // VARIABLES
  private final String key;
  private final String value;

  // VALIDATION
  public void validateValue(String inputValue) {
    if (!isValid(inputValue)) {
      throw new RuntimeException("Invalid value: " + inputValue);
    }
  }

  private boolean isValid(String value) {
    return Arrays.stream(LocationType.values())
        .anyMatch(locationType -> locationType.getValue().equalsIgnoreCase(value));
  }
}
