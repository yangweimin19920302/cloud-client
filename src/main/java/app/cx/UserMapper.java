package app.cx;


import app.bean.Device;

/**
 * Created by Administrator on 2016/5/4.
 */
public interface UserMapper {
    Device get(String id);
    void add(Device device);
}
