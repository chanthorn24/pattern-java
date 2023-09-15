package utils;

import constant.CarConstant;
import java.util.Arrays;

public enum CarType {
  SMALL("small", CarConstant.SMALL, 100),
  SEDAN("sedan", CarConstant.SEDAN, 200),
  LUXURY("luxury", CarConstant.LUXURY, 300);

  private final String key;
  private final String value;
  private final double speed;

  public double getSpeed() {
    return speed;
  }


  CarType(String key, String value, double speed) {
    this.key = key;
    this.value = value;
    this.speed = speed;
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
