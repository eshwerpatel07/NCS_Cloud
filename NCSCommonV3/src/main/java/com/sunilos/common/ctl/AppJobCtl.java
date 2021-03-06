package com.sunilos.common.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sunilos.common.dto.AppJobDTO;
import com.sunilos.common.form.AppJobForm;
import com.sunilos.common.service.AppJobServiceInt;
import com.sunilos.common.*;

@RestController
@RequestMapping(value = "AppJob")
public class AppJobCtl extends BaseCtl<AppJobForm, AppJobDTO, AppJobServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		return res;
	}

	@GetMapping("name/{name}")
	public ORSResponse get(@PathVariable String name) {
		ORSResponse res = new ORSResponse(true);
		AppJobDTO dto = baseService.findByName(name,userContext);
		System.out.println("AppJob " + dto);
		if (dto != null) {
			res.addData(dto);
		} else {
			res.setSuccess(false);
			res.addMessage("Record not found");
		}
		return res;
	}

}
