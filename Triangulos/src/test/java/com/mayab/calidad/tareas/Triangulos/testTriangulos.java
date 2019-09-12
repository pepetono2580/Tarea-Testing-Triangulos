package com.mayab.calidad.tareas.Triangulos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class testTriangulos {
	App triangulo = new App();
	@Before
	public void setUp() throws Exception {
		System.out.println("Antes");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Despues");
	}

	@Test
	public void equilatero() {
		assertThat(triangulo.triangulos(5, 5, 5), is("Equilatero"));
	}
	@Test
	public void isoceles() {
		assertThat(triangulo.triangulos(5, 5, 2), is("Isoceles"));
	}
	@Test
	public void escaleno() {
		assertThat(triangulo.triangulos(5, 6, 2), is("Escaleno"));
	}
	@Test
	public void esTriangulo() {
		assertThat(triangulo.triangulos(0, 0, 0), is("No es un triangulo"));
	}
	@Test
	public void negativos() {
		assertThat(triangulo.triangulos(-1, -1, 5), is("Isoceles"));
	}

}
