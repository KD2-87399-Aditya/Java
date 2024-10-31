package com.sunbeam;

import java.io.Serializable;
import java.util.Objects;

public class Projects implements Serializable {
	private int id;
	private String title;
	private int teamSize;
	private double projectCost;
	private String technology;

	public Projects(int id, String title, int teamSize, double projectCost, String technology) {
		this.id = id;
		this.title = title;
		this.teamSize = teamSize;
		this.projectCost = projectCost;
		this.technology = technology;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public double getProjectCost() {
		return projectCost;
	}

	public String getTechnology() {
		return technology;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Projects))
			return false;
		Projects project = (Projects) o;
		return id == project.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Project{" + "id=" + id + ", title='" + title + '\'' + ", teamSize=" + teamSize + ", projectCost="
				+ projectCost + ", technology='" + technology + '\'' + '}';
	}
}
