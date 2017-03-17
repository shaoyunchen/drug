package com.cec.controller;

import com.cec.login.DrugUserDetails;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by shaoyun_book on 2017/3/14.
 */
@Controller
@RequestMapping("/")
public class MainController {

//    @RequestMapping("/")
//    @PreAuthorize("hasRole('ROLE_USER')")
//    public @ResponseBody String index(){
//        return "this is springboot test";
//    }

    @RequestMapping("/")
    public String home(Model model) {
        //获取认证信息
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = userDetails.getUsername();
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        List<String> authlist = new ArrayList<>();
        for (GrantedAuthority grantedAuthority : authorities) {
            String authority = grantedAuthority.getAuthority();
            authlist.add(authority);
        }
        //当前登陆用户
        model.addAttribute("username", username);
        //当前用户拥有权限
        model.addAttribute("authlist", authlist);
        return "index";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/login")
    public String login() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth instanceof AnonymousAuthenticationToken)
             return "login";
        else
            return "index";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request,HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:login?logout";
    }


   /* @RequestMapping("/login?error")
    public String login_error(){
        return "login";
    }


    @RequestMapping("/login?expired")
    public String login_expired(){

        return "login";
    }*/


    @RequestMapping("/unauthorized")
    public String error() {

        return "unauthorized";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(ModelAndView model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        DrugUserDetails userDetails = (DrugUserDetails) principal;
        String username = userDetails.getUsername();
        System.err.println(username);
        System.err.println(userDetails.getFullName());
        System.err.println(userDetails.getUserNo());
        System.err.println(userDetails.getUserNo().toString());
        userDetails.getRoles().forEach(role -> System.out.println(role));
        model.addObject("user", userDetails);
        return "hello";
    }
}
