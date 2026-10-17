package com.example.service;

public class ListOfEveningMembers implements ShowingDetailsOfMemebers
{

	@Override
	public int AddMember() {
		// TODO Auto-generated method stub
		System.out.println("workout plan for evening memebrs");
		return 2;
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
		System.out.println("updated members name");
		return "john,kombdi";
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
		System.out.println("workout plan for evening batch ");
		return " sprints , running, cardio";
	}

	@Override
	public String AddDietPlan() {
		// TODO Auto-generated method stub
		System.out.println("diet plan for evening batch");
		return "carbs , protein, vitamin";
	}

	@Override
	public int TotalMember() {
		// TODO Auto-generated method stub
		System.out.println("total number of gym member in evening batch");
		return 200;
	}

}
