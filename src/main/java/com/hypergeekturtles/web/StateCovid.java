package com.hypergeekturtles.web;

public class StateCovid {
public String state;
public int confirmed;
public int deaths;
public int recovered;
public int active;


public StateCovid(String state, int confirmed, int deaths, int recovered, int active) {
	this.state = state;
	this.confirmed = confirmed;
	this.deaths = deaths;
	this.recovered = recovered;
	this.active = active;
	// TODO: set attributes for confirmed, deaths, recovered and active
}
}