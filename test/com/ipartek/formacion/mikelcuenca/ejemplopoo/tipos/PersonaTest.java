/*
 * package com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos;
 * 
 * import static org.junit.Assert.assertEquals; import static org.junit.Assert.fail;
 * 
 * import java.util.Date;
 * 
 * import org.junit.After; import org.junit.AfterClass; import org.junit.Before; import org.junit.BeforeClass; import org.junit.Test;
 * 
 * public class PersonaTest {
 * 
 * Persona p;
 * 
 * @BeforeClass public static void setUpBeforeClass() throws Exception { }
 * 
 * @AfterClass public static void tearDownAfterClass() throws Exception { }
 * 
 * @Before public void setUp() throws Exception { p = new Persona(); }
 * 
 * @After public void tearDown() throws Exception { p = null; }
 * 
 * @Test public void testPersona() { assertEquals("Anónimo", p.getNombre()); assertEquals(0, p.getId()); assertEquals(null, p.getFechaNacimiento()); }
 * 
 * @Test public void testPersonaIntString() { fail("Not yet implemented"); }
 * 
 * @Test public void testSetId() { p.setId(5); assertEquals(5, p.getId()); }
 * 
 * @Test public void testGetId() { assertEquals(0, p.getId()); }
 * 
 * @Test public void testSetNombre() { p.setNombre("Nombre_de_prueba"); assertEquals("Nombre_de_prueba", p.getNombre()); }
 * 
 * @Test public void testGetNombre() { assertEquals("Anónimo", p.getNombre()); }
 * 
 * @Test public void testSetFechaNacimiento() { p.setFechaNacimiento(new Date("1980/10/10")); assertEquals("Fri Oct 10 00:00:00 CET 1980", p.getFechaNacimiento()); }
 * 
 * @Test public void testGetFechaNacimiento() { assertEquals("Fri Oct 10 00:00:00 CET 1970", p.getFechaNacimiento()); }
 * 
 * @Test public void testATexto() { assertEquals("ID: 0, NOMBRE: Anónimo, FECHA_NACIMIENTO: 10-10-1970", p.aTexto()); }
 * 
 * }
 */