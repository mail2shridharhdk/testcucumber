package com.smalltest.sample.cucumber;

public class User {
private String uid;
private String fname;
private String lname;

public User(String uid,String fname, String lname)
{
	this.fname=fname;
	this.lname=lname;
	this.uid=uid;
}

@Override
public String toString()
{
	return uid+":"+fname+":"+lname;
}
}
