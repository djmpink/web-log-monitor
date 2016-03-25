package cn.no7player.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zhouli on 2016/3/25.
 */
@ConfigurationProperties(locations = "classpath:common.properties", ignoreUnknownFields = false, prefix = "common")
@Component
public class CommonConfig {

    private static String logpath;

    public static String getLogpath() {
        return logpath;
    }

    public static void setLogpath(String logpath) {
        CommonConfig.logpath = logpath;
    }
}
