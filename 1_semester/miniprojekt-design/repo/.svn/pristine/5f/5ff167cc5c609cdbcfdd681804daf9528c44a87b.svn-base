package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPersonContainer {
  private Person p;
  private Person p1;

  @Before
  public void setUp() {
    p = new Person(1, "Peter Petersen", "Jensensvej 4", "9000", "Aalborg", "88888888");
    p1 = new Person(2, "Jens Jensen", "Hejvej 4", "9000", "Aalborg", "33333333");
    PersonContainer.getInstance().addPerson(p);
    PersonContainer.getInstance().addPerson(p1);
  }

  @After
  public void tearDown(){
    PersonContainer.getInstance().deletePerson(p.getId());
    PersonContainer.getInstance().deletePerson(p1.getId());
    p = null;
    p1 = null;
  }

  @Test
  public void addPerson() {
    int expectedSizeOfPersonsList = 2;
    int actualSizeOfPersonsList = PersonContainer.getInstance().findAll().size();
    assertEquals(expectedSizeOfPersonsList, actualSizeOfPersonsList);
  }

  @Test
  public void findPerson() {
    Person expectedPerson = p;
    Person actualPerson = PersonContainer.getInstance().findPerson(p.getId());

    assertEquals(expectedPerson.getId(), actualPerson.getId());
    assertEquals(expectedPerson.getName(), actualPerson.getName());
  }

  @Test
  public void deletePerson() {
    Person p2 = new Person(3, "Thomas Thomasen", "Hejvej 4", "9000", "Aalborg", "33333333");
    PersonContainer.getInstance().addPerson(p2);

    PersonContainer.getInstance().deletePerson(p2.getId());
    int expectedSizeOfPersonsList = 2;
    int actualSizeOfPersonsList = PersonContainer.getInstance().findAll().size();
    assertEquals(expectedSizeOfPersonsList, actualSizeOfPersonsList);
  }

  @Test
  public void getLastPersonId() {
    int lastId = PersonContainer.getInstance().getLastPersonId();

    assertEquals(2, lastId);
  }
}