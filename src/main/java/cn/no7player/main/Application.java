package cn.no7player.main;

import cn.no7player.web.WebLogMonitor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Created by li on 2016/3/23.
 */
@SpringBootApplication
@EnableWebSocket
public class Application {
    private static Log logger = LogFactory.getLog(Application.class);

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
    @Bean
    public WebLogMonitor webLogMonitor() {
        return new WebLogMonitor();
    }
    public static void main(String[] args) throws Exception {
        logger.info("Application initialized");
        SpringApplication.run(Application.class, args);
    }
}
