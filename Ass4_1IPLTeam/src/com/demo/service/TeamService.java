package com.demo.service;

import com.demo.*;
import com.demo.model.Player;
import com.demo.model.Team;

import java.util.*;

public class TeamService {
	
	private ArrayList<Team> teamList =  new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void addTeam() {
		System.out.println("Enter Team Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Team Name : ");
		String name =  sc.nextLine();
		
		System.out.println("Enter Coach Name : ");
		String coachName = sc.nextLine();
		
		 teamList.add(new Team(id, name, coachName));
		
	}
	
	public void deleteTeam() {
		System.out.println("Enter Team Id for delete Team : ");
		int id = sc.nextInt();
		
		teamList.removeIf(t -> t.getTeamId() == id);
	}
	
	 public void deletePlayer() {
	        System.out.print("Enter Player ID: ");
	        int pid = sc.nextInt();

	        for (Team t : teamList) {
	            t.getPlayers().removeIf(p -> p.getPlayerId() == pid);
	        }
	    }
	 
	 public void displayBatsman() {
	        for (Team t : teamList) {
	            for (Player p : t.getPlayers()) {
	                if (p.getSpeciality().equalsIgnoreCase("batsman")) {
	                    p.display();
	                }
	            }
	        }
	    }
	 
	 public void displayBySpeciality() {
	        sc.nextLine();
	        System.out.print("Enter Speciality: ");
	        String sp = sc.nextLine();

	        for (Team t : teamList) {
	            for (Player p : t.getPlayers()) {
	                if (p.getSpeciality().equalsIgnoreCase(sp)) {
	                    p.display();
	                }
	            }
	        }
	    }

	   
	    public void addPlayerToTeam() {
	        System.out.print("Enter Team ID: ");
	        int tid = sc.nextInt();

	        for (Team t : teamList) {
	            if (t.getTeamId() == tid) {
	                System.out.print("Enter Player ID: ");
	                int pid = sc.nextInt();
	                sc.nextLine();

	                System.out.print("Enter Player Name: ");
	                String name = sc.nextLine();

	                System.out.print("Enter Speciality: "); 
	                String sp = sc.nextLine();

	                t.addPlayer(new Player(pid, name, sp));
	            }
	        }
	    }

	 
	    public void modifyCoach() {
	        System.out.print("Enter Team ID: ");
	        int tid = sc.nextInt();
	        sc.nextLine();

	        for (Team t : teamList) {
	            if (t.getTeamId() == tid) {
	                System.out.print("Enter New Coach Name: ");
	                String coach = sc.nextLine();
	                t.setCoachName(coach);
	            }
	        }
	    }

	   
	    public void displayAll() {
	        for (Team t : teamList) {
	            t.display();
	        }
	    }
	}


