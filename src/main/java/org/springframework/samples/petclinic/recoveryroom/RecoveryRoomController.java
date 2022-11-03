package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecoveryRoomController {
    
	private static final String VIEW_REATE_UPDATE_FORM = "recoveryroom/createOrUpdateRecoveryRoomForm";
	
	@Autowired
	private RecoveryRoomService rrservice;
	
	@GetMapping(value = "/recoveryroom/create")
	public String getCreationForm(Map<String, Object> model) {
		List<RecoveryRoomType>	rrtList = rrservice.getAllRecoveryRoomTypes();
		RecoveryRoom rr = new RecoveryRoom();
		model.put("recoveryRoom", rr);
		model.put("types", rrtList);
		return VIEW_REATE_UPDATE_FORM;
		}
	
}
