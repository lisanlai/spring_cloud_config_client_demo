package us.zoom.configclientdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Sam.Li on 2018/8/30.
 *
 * @author sam.li@zoom.us
 */
@Component
@ConfigurationProperties(prefix="project")
public class ProjectProperties {

    private String name;

    private String version;

    private String environment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
