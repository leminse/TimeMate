package com.minseo.timemate.TimeMate.Controller;

import com.minseo.timemate.TimeMate.DTO.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class LoginController {
    @GetMapping("/")
    public String login(){
        return "login";
    }

    @PostMapping("login")
    public String login(LoginDTO dto, Model model){
        model.addAttribute("Login", dto);

        if(dto.getUserid()){
            System.out.println("로그인되었습니다.");
            return "";
        }
        else{
            System.out.println("비밀번호 또는 아이디가 틀렸습니다.");
            System.out.println("아이디 : " + dto.getUserid());
            System.out.println("비밀번호 : " + dto.getPassword());
            return "login";
        }
    }
}
