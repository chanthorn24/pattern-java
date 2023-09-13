package utils;

import constant.CarConstant;
import java.util.Arrays;

public enum CarType {
  SMALL("small", CarConstant.SMALL),
  SEDAN("sedan", CarConstant.SEDAN),
  LUXURY("luxury", CarConstant.LUXURY);

  private final String key;
  private final String value;

  CarType(String key, String value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public String getValue() {
    return value;
  }

  public void validateValue(String inputValue) {
    if (!isValid(inputValue)) {
      throw new RuntimeException("Invalid value: " + inputValue);
    }
  }

  public boolean isValid(String value) {
    return Arrays.stream(CarType.values())
        .anyMatch(carType -> carType.getValue().equalsIgnoreCase(value));
  }
}
