package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ListOfEveningMembers;
import com.example.service.ListOfMorningMembers;
import com.example.service.ShowingDetailsOfMemebers;

@RestController
public class MemebersController {

	@GetMapping("show/{type}")
	public int showingDetlis(@PathVariable String type) {

		ShowingDetailsOfMemebers s = Factory.createObject(type);
		s.AddMember();
		s.UpdateMember();
		s.Name();
		s.viewAttendance();
		s.WorkoutPlan();
		s.AddDietPlan();
		return s.TotalMember();
		
	}
		@GetMapping("hello")
		String m2() {
			return "heelo";
		}

	
}

class Factory {
	public static ShowingDetailsOfMemebers createObject(String type) {
		if (type.equals("john")) {
			ShowingDetailsOfMemebers l = new ListOfEveningMembers();
			return l;
		}
		if (type.equals("bob,")) {
			ShowingDetailsOfMemebers l1 = new ListOfMorningMembers();
			return l1;

		}
		return null;
	}
}