package application.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class MainController {

    @Autowired
    ResourceLoader resourceLoader;

    @RequestMapping("/")
    @ResponseBody
    String getMainPage(){
        return "Hello";
    }

    @RequestMapping("/buscador-imagen")
    ModelAndView getMainPage(ModelAndView mv){
        mv.setViewName("buscador-imagenes");
        mv.addObject("imagen","");
        return mv;
    }

    @RequestMapping(value="/buscador-imagen", method=RequestMethod.POST)
    ModelAndView searchimage(HttpServletRequest request,ModelAndView mv){
        String imageName;
        imageName = request.getParameter("FirstName");
        Resource resource = resourceLoader.getResource(imageName);
        mv.setViewName("buscador-imagenes");
        mv.addObject("imagen",imageName);
        return mv;
    }
}
