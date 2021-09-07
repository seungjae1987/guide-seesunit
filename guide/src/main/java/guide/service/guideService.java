package guide.service;

import java.util.HashMap;
import java.util.List;

public abstract interface guideService
{
  public abstract List<HashMap<String, Object>> retruveData();

  public abstract List<HashMap<String, Object>> retruveDataKey(HashMap<String, Object> paramHashMap);
}