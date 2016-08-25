package admin_jyb.coolweather.util;

/**
 * Created by Admin-JYB on 2016/8/25.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
