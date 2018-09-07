package us.zoom.configclientdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import us.zoom.configclientdemo.properties.ProjectProperties;

/**
 * Created by Sam.Li on 2018/8/30.
 *
 * @author sam.li@zoom.us
 */
@RestController
@EnableConfigurationProperties(ProjectProperties.class)
public class ProjectController {

    private final ProjectProperties projectProperties;

    @Autowired
    public ProjectController(ProjectProperties projectProperties) {
        this.projectProperties = projectProperties;
    }

    @GetMapping("/project/info")
    public Object info(){
        return projectProperties;
    }

}
