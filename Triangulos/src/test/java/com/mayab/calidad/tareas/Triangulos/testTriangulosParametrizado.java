package com.mayab.calidad.tareas.Triangulos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class testTriangulosParametrizado {
	public App testParametized = new App();
	
	 private int lado1;
	 private int lado2;
	 private int lado3;
	 private String expected;
	       
	    public testTriangulosParametrizado(String esperado, int l1, int l2, int l3) {
	    	this.expected = esperado;
	    	this.lado1 = l1;
	    	this.lado2 = l2;
	    	this.lado3 = l3;
	    }
	@Parameters
	public static Collection<Object[]>data(){
		return Arrays.asList(new Object[][] {
			{"Equilatero", 5, 5, 5}, 
			{"Isoceles", 4, 4, 2},
			{"Escaleno", 3, 4, 5},
			{"No es un triangulo", 0, 0, 0}
		});
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("Antes");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Despues");
	}

	@Test
	public void testeo() {
		Assert.assertThat(this.expected, is(testParametized.triangulos(this.lado1, this.lado2, this.lado3)));
	}

}
