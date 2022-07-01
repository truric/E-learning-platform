package springprojects.Elearningplatform.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import springprojects.Elearningplatform.Repository.UserRepository;
import springprojects.Elearningplatform.User.User;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    private ModelAndView showUsers() {
        ModelAndView mv = new ModelAndView("show-users");
        List<User> list = userRepository.findAll();
        mv.addObject("users", list);
        return mv;
    }
}
