package csk.validate.implement;

import csk.validate.annotation.CheckUserNameIsExist;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/*
 * 自定义验证接口实现
 * */
public class CheckUserNameIsExistImplement implements ConstraintValidator<CheckUserNameIsExist, CharSequence> {
    public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
        if ((charSequence instanceof String) && charSequence.toString().trim().equals("csk")) {
            return false;
        }
        return true;
    }
}
