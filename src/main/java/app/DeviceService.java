package app;

import app.bean.Device;
import app.cx.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * Created by Administrator on 2016/5/4.
 */
@Service
public class DeviceService {
    @Autowired
    UserMapper userMapper;

    public Device get(String id) {
        return userMapper.get(id);
    }

    @Transactional
    public void add() {
        Device device = new Device();
        device.setDeviceID(UUID.randomUUID().toString());
        device.setDeviceName("送达方三房");
        userMapper.add(device);
    }
}
