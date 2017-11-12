package etelfutar.logic;

import etelfutar.logic.model.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    //@Override
    public void validate(User user, BindingResult bindingResult) {
        String name = user.getUsername();
        String passwd = user.getPassword();

        Errors errors = (Errors) bindingResult;

        if (name.length()<4 || name.length()>32 ){
            errors.rejectValue("username", "Size.userForm.username");

        }

        if (passwd.length()<6 || passwd.length()>32){
            errors.rejectValue("password", "Size.userForm.password");

        }

    }


    public static boolean validator(User user){
        String name = user.getUsername();
        String passwd = user.getPassword();


        if (name.length()<4 || name.length()>32 && passwd.length()<6 || passwd.length()>32 ){
            return true;

        }


        return false;


    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {

    }
}
