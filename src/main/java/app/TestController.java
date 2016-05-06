package app;

import app.bean.Device;
import app.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/5/4.
 */
@Controller
public class TestController {

    @Autowired
    DeviceService service;

    @Autowired
    User user;

    @RequestMapping("/get")
    @ResponseBody
    public Device get() {
        return service.get("40A5EF84BF02");
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add() {
       service.add();
        return "成功";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(User u) {
        return u.getId();
    }
}
