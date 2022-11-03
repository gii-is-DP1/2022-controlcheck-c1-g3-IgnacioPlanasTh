package org.springframework.samples.petclinic.recoveryroom;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
import org.springframework.samples.petclinic.recoveryroom.*;
@Component
public class RecoveryRoomTypeFormatter implements Formatter<RecoveryRoomType>{

	@Autowired
	private RecoveryRoomService rrservice;
	
    @Override
    public String print(RecoveryRoomType object, Locale locale) {
        return object.getName();
//    	return null;
    }

    @Override
    public RecoveryRoomType parse(String text, Locale locale) throws ParseException {
        RecoveryRoomType rrt = rrservice.getRecoveryRoomType(text);
        if(rrt!=null) {
        	return rrt;
        }else {
        	throw new ParseException("No se ha encontrado", -1);
        }
//    	return null;
    }
    
}
