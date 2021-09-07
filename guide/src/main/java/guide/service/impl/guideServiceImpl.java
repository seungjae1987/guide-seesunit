package guide.service.impl;

import guide.mapper.guideMapper;
import guide.service.guideService;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("guideService")
public class guideServiceImpl
  implements guideService
{

  @Resource(name="guideMapper")
  protected guideMapper guideMapper;

  public List<HashMap<String, Object>> retruveData()
  {
    return this.guideMapper.retruveData();
  }

  public List<HashMap<String, Object>> retruveDataKey(HashMap<String, Object> parm)
  {
    return this.guideMapper.retruveDataKey(parm);
  }
}