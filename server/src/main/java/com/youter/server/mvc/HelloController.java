package com.youter.server.mvc;

import com.youter.backend.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    private IProjectService projectService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "hello";
    }

    @RequestMapping(value="projects", method = RequestMethod.GET)
    public String projectCount(ModelMap modelMap) {
        modelMap.addAttribute("projectCount", projectService.getNumberOfProjects());

        return "projects";
    }
}