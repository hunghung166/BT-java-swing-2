/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtutorial;

import com.sun.xml.internal.bind.v2.model.core.ID;
import java.util.HashMap;

/**
 *
 * @author nguyenhung
 */
public class FormHandle {

    /**
     *
     * @param stu
     * @return
     */
    public HashMap<String, String> validateLogin(Student stu) {

        HashMap<String, String> errors = new HashMap<>();
        if (stu.id.isEmpty()) {
            errors.put("txtId", "*Vui lòng nhập vào id.");
        }
        
        if (stu.name.isEmpty()) {
            errors.put("txtName", "*Vui lòng nhập vào tên.");
        }

        return errors;

    }
;
}
