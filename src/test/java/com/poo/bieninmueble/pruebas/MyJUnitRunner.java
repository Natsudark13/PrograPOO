package com.poo.bieninmueble.pruebas;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyJUnitRunner {
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JUnitAgente.class);
		
		for (Failure fail: result.getFailures()) {
			System.out.println(fail.toString());
		}
		System.out.println("Result: "+result.wasSuccessful());

	}

}
