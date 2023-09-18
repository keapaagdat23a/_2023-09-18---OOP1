package mykids;

import java.time.LocalDateTime;

public class Kid {
  String name;
  int yearOfBirth;

  @Override
  public String toString() {
    return name + ", " + (LocalDateTime.now().getYear() - yearOfBirth);
  }
}
