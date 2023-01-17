package com.gl.hibernate.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gl.hibernate.entity.Teacher;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("Connecting to database");
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Teacher.class)
				.buildSessionFactory();
		System.out.println("created");
	}
}
