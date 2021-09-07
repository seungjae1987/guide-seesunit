package guide.mapper;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("guideMapper")
public class guideMapper extends EgovComAbstractDAO
{
  public List<HashMap<String, Object>> retruveData()
  {
    String sqlId = "guide.retruveDate";

    return (List<HashMap<String, Object>>) list(sqlId, null);
  }

  public List<HashMap<String, Object>> retruveDataKey(HashMap<String, Object> parm)
  {
    String sqlId = "guide.retruveDateKey";

    return (List<HashMap<String, Object>>) list(sqlId, parm);
  }
}