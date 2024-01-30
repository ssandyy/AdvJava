package com.entities;

public class Results {
    private String RegistrationNo;
    private int Hindi;
    private int English;
    private int Maths;
    private int Science;
    private int SocialScience;

    public String getRegistrationNo() {
        return RegistrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        RegistrationNo = registrationNo;
    }

    public int getHindi() {
        return Hindi;
    }

    public void setHindi(int hindi) {
        Hindi = hindi;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getMaths() {
        return Maths;
    }

    public void setMaths(int maths) {
        Maths = maths;
    }

    public int getScience() {
        return Science;
    }

    public void setScience(int science) {
        Science = science;
    }

    public int getSocialScience() {
        return SocialScience;
    }
    

    public void setSocialScience(int socialScience) {
        SocialScience = socialScience;
    }

	public Results() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Results [RegistrationNo=" + RegistrationNo + ", Hindi=" + Hindi + ", English=" + English + ", Maths="
				+ Maths + ", Science=" + Science + ", SocialScience=" + SocialScience + "]";
	}
    
}
