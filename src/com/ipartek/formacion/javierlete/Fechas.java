package com.ipartek.formacion.javierlete;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fechas {
	public static void main(String[] args) {
		Calendar gc = new GregorianCalendar();

		System.out.println(gc.get(Calendar.DATE));
		System.out.println(gc.get(Calendar.MONTH) + 1);
		System.out.println(gc.get(Calendar.YEAR));

		gc = new GregorianCalendar(2017, 6 - 1, 5, 4, 3, 2);

		String s = DateFormat.getDateInstance(DateFormat.SHORT).format(gc.getTime());

		System.out.println(s);
	}
}
