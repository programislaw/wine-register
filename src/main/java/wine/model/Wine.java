package wine.model;

public class Wine {

  private final String name;
  private final String kind;
  private final Double volume;

  public Wine(String name, String kind, Double volume) {
    this.name = name;
    this.kind = kind;
    this.volume = volume;
  }

  public String getName() {
    return name;
  }

  public String getKind() {
    return kind;
  }

  public Double getVolume() {
    return volume;
  }
}
