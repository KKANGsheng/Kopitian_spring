package com.example.KopitianBackend;

import com.example.KopitianBackend.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.KopitianBackend.Model.Message;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FormController {

    @Autowired
    private MessageRepository messagerepo;
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return"about";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }


    @PostMapping("/submitform")
    public String formmessage(@ModelAttribute Message message,Model model){
    Message messagename=messagerepo.save(message);
    model.addAttribute("message","thanks for the message");
    return "Message";
    }



}
