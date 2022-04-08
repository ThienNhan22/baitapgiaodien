/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapInterface1;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Studen implements Cloneable, Serializable {
	private String fullname;
	private String birthday;
	private String gender;
	private double gba;
	private int social_activities;
	
	public Studen(String fullname, String birthday, String gender, double gba, int social_activities) {
		super();
		this.fullname = fullname;
		this.birthday = birthday;
		this.gender = gender;
		this.gba = gba;
		do {
		Scanner scanner = new Scanner(System.in);
		this.social_activities = social_activities;
		if(social_activities <0 ||social_activities >5) {
			System.out.println("vui long nhap lai social_activities ");
			social_activities = scanner.nextInt();
			this.social_activities = social_activities;
		}
		}while(social_activities <0 ||social_activities >5);
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getGba() {
		return gba;
	}
	public void setGba(double gba) {
		this.gba = gba;
	}
	public int getSocial_activities() {
		return social_activities;
	}
        @SuppressWarnings("empty-statement")
	public void setSocial_activities(int social_activities) {
		this.social_activities = social_activities;
		if(social_activities <=0 ||social_activities >=5) {
			System.out.println("vui long nhap lai");
		}while(social_activities <=0 ||social_activities >=5);
	}

    /**
     *
     * @param c
     * @return
     */
    @Override
	public int Cloneable(Studen c) {
		if(this.getGba() == c.getGba() && this.getSocial_activities() == c.getSocial_activities()){
			return 0;
		}if(this.getSocial_activities() > c.getSocial_activities() ||(this.getGba()== c.getGba() && this.getSocial_activities()>c.getSocial_activities())) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
}


