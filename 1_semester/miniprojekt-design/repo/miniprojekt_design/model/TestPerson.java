package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {
  private Person p;

  public TestPerson() {
  }

  @Before
  public void setUp() {
    p = new Person(1, "Peter Petersen", "Jensensvej 4", "9000", "Aalborg", "88888888");
  }

  @Test
  public void setId() {
    int newId = 99;

    p.setId(newId);

    assertEquals(99, p.getId());
  }

  @Test
  public void getId() {
    assertEquals(1, p.getId());
  }

  @Test
  public void setName() {
    String newName = "Peter Madsen";

    p.setName(newName);

    assertEquals(newName, p.getName());
  }

  @Test
  public void getName() {
    assertEquals("Peter Petersen", p.getName());
  }

  @Test
  public void setAddress() {
    String newAddress = "Langagervej 4";

    p.setAddress(newAddress);

    assertEquals(newAddress, p.getAddress());
  }

  @Test
  public void getAddress() {
    assertEquals("Jensensvej 4", p.getAddress());
  }

  @Test
  public void setPostalCode() {
    String newPostalCode = "9220";

    p.setPostalCode(newPostalCode);

    assertEquals(newPostalCode, p.getPostalCode());
  }

  @Test
  public void getPostalCode() {
    assertEquals("9000", p.getPostalCode());
  }

  @Test
  public void setCity() {
    String newCity = "Aalborg Øst";

    p.setCity(newCity);

    assertEquals(newCity, p.getCity());
  }

  @Test
  public void getCity() {
    assertEquals("Aalborg", p.getCity());
  }

  @Test
  public void setPhone() {
    String newPhone = "33333333";

    p.setPhone(newPhone);

    assertEquals(newPhone, p.getPhone());
  }

  @Test
  public void getPhone() {
    assertEquals("88888888", p.getPhone());
  }
}