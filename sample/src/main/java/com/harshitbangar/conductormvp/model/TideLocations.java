package com.harshitbangar.conductormvp.model;

import android.support.annotation.DrawableRes;
import com.harshitbangar.conductormvp.R;

public enum TideLocations {
  SAN_FRANCISCO(9414290, R.drawable.san_francisco, "San Francisco"),
  SEATTLE(9447130, R.drawable.seattle, "Seattle"),
  ANCHORAGE(9455920, R.drawable.anchorage, "Anchorage"),
  GALVESTON(8771450, R.drawable.galveston, "Galveston"),
  MIAMI(8723214, R.drawable.miami, "Miami"),
  CHARLESTON(8665530, R.drawable.charleston, "Charleston"),
  CHESAPEAKE_BAY(8638863, R.drawable.chesapeake, "Chesapeake Bay"),
  NEW_YORK(8518750, R.drawable.new_york, "New York"),
  BOSTON(8443970, R.drawable.boston, "Boston"),
  WASHINGTON_DC(8594900, R.drawable.washington_dc, "Washington D.C.");

  int noaaApiId;
  @DrawableRes int imageId;
  String name;

  TideLocations(int noaaApiId, @DrawableRes int imageId, String name) {
    this.noaaApiId = noaaApiId;
    this.imageId = imageId;
    this.name = name;
  }

  public int getNoaaApiId() {
    return noaaApiId;
  }

  public @DrawableRes int getImageId() {
    return imageId;
  }

  public String getName() {
    return name;
  }

}
