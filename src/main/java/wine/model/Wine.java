package wine.model;

public class Wine {

  private final String name;
  private final Long volume;

  public Wine(String name, Long volume) {
    this.name = name;
    this.volume = volume;
  }

  public String getName() {
    return name;
  }

  public Long getVolume() {
    return volume;
  }
}
