package guide.web;

import com.google.gson.Gson;
import guide.service.guideService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class guideController
{

  @Resource(name="guideService")
  protected guideService guideService;

  @RequestMapping({"main.do"})
  private String main()
  {
    return "main";
  }

  @RequestMapping({"retruveData.do"})
  private void retruveData(HttpServletRequest req, HttpServletResponse res, ModelMap map)
  {
    List retriveList = this.guideService.retruveData();

    Gson gson = new Gson();
    String jsonList = gson.toJson(retriveList);
    res.setContentType("application/json");
    res.setCharacterEncoding("utf-8");
    try
    {
      res.getWriter().write(jsonList);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  @RequestMapping({"retruveDataKey.do"})
  private void retruveDataKey(HttpServletRequest req, HttpServletResponse res)
  {
    HashMap parm = new HashMap();

    parm.put("key", req.getParameter("search_key"));

    List retriveList = this.guideService.retruveDataKey(parm);

    Gson gson = new Gson();
    String jsonList = gson.toJson(retriveList);
    res.setContentType("application/json");
    res.setCharacterEncoding("utf-8");
    try
    {
      res.getWriter().write(jsonList);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}