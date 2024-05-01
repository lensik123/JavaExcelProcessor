package org.example.comparator.universityComparator;

import org.apache.commons.lang3.StringUtils;
import org.example.classes.University;

public class SortByShortName implements UniversityComparator{

  @Override
  public int compare(University o1, University o2) {
    return StringUtils.compare(o1.getShortName(), o2.getShortName());
  }
}
