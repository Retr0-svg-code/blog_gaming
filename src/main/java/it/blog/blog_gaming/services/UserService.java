// METODI DA IMPLEMENTARE: SAVEUSER E FINDUSERBYEMAIL

package it.blog.blog_gaming.services;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import it.blog.blog_gaming.dtos.UserDto;
import it.blog.blog_gaming.models.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface UserService {

    void saveUser(UserDto userDto, RedirectAttributes redirectAttributes, HttpServletRequest request, HttpServletResponse response);
    User findUserByEmail(String email);
}
