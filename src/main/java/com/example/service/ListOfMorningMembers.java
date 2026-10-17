package com.example.service;

public class ListOfMorningMembers implements ShowingDetailsOfMemebers
{

	@Override
	public int AddMember() {
		// TODO Auto-generated method stub
		System.out.println("adding memebers ");
		return 3;
	}

	@Override
	public int UpdateMember() {
		// TODO Auto-generated method stub
		System.out.println("updated memebers list");
		return 2;
	}

	@Override
	public String Name() {
		// TODO Auto-generated method stub
		System.out.println("updatedn members name");
		return "bob, tina";
	}

	@Override
	public int viewAttendance() {
		// TODO Auto-generated method stub
		System.out.println("daily updated attendence");
		return 35;
	}

	@Override
	public String WorkoutPlan() {
		// TODO Auto-generated method stub
		System.out.println("workout plan for morning memeber");
		
		return "legs, chest, sprints, lunges";
	}

	@Override
	public String AddDietPlan() {
		// TODO Auto-generated method stub
		System.out.println("diet plan for morning batch");
		return " carbs ,protein, vitamin";
	}

	@Override
	public int TotalMember() {
		// TODO Auto-generated method stub
		System.out.println("total number of gym member in morning batch");
		return 150;
	}
}
