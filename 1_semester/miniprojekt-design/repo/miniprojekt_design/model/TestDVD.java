package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDVD {
  private DVD d;

  @Before
  public void setUp() {
    d = new DVD("123456", "Saw IV", "Darren Lynn Bousman", "02/09-2007");
  }

  @After
  public void tearDown() {

  }

  @Test
  public void addCopy() {
    DVDCopy dc = new DVDCopy("9999999999", "05/01-2008", "20$", d);
    DVDCopy dc1 = new DVDCopy("9898989898", "05/01-2008", "20$", d);
    d.addCopy(dc);
    d.addCopy(dc1);
    int expectedCopies = 2;
    int actualCopies = d.getCopies().size();

    assertEquals(expectedCopies, actualCopies);
  }

  @Test
  public void getDVDCopy() {
    DVDCopy dc = new DVDCopy("9999999999", "05/01-2008", "20$", d);
    DVDCopy dc1 = new DVDCopy("9898989898", "08/01-2008", "20$", d);
    d.addCopy(dc);
    d.addCopy(dc1);

    String expectedCopyPurchaseDate = "05/01-2008";
    String actualCopyPurchaseDate = d.getDVDCopy(dc.getSerialNo()).getPurchaseDate();
    String expectedDVDTitle = "Saw IV";
    String actualDVDTitle = d.getDVDCopy(dc.getSerialNo()).getDvd().getTitle();

    assertEquals(expectedCopyPurchaseDate, actualCopyPurchaseDate);
    assertEquals(expectedDVDTitle, actualDVDTitle);
  }

  @Test
  public void getCopies() {
    DVDCopy dc = new DVDCopy("9999999999", "05/01-2008", "20$", d);
    DVDCopy dc1 = new DVDCopy("9898989898", "08/01-2008", "20$", d);
    d.addCopy(dc);
    d.addCopy(dc1);

    int expectedCopies = 2;
    int actualCopies = d.getCopies().size();

    assertEquals(expectedCopies, actualCopies);
  }

  @Test
  public void removeCopy() {
    DVDCopy dc = new DVDCopy("9999999999", "05/01-2008", "20$", d);
    DVDCopy dc1 = new DVDCopy("9898989898", "08/01-2008", "20$", d);
    d.addCopy(dc);
    d.addCopy(dc1);
    d.removeCopy(dc1);

    int expectedCopies = 1;
    int actualCopies = d.getCopies().size();

    assertEquals(expectedCopies, actualCopies);
  }

  @Test
  public void getBarcode() {
    String expected = "123456";
    String actual = d.getBarcode();

    assertEquals(expected, actual);
  }

  @Test
  public void setBarcode() {
    d.setBarcode("123");

    String expected = "123";
    String actual = d.getBarcode();

    assertEquals(expected, actual);
  }

  @Test
  public void getTitle() {
    String expected = "Saw IV";
    String actual = d.getTitle();

    assertEquals(expected, actual);
  }

  @Test
  public void setTitle() {
    d.setTitle("Saw VI");

    String expected = "Saw VI";
    String actual = d.getTitle();

    assertEquals(expected, actual);
  }

  @Test
  public void getArtist() {
    String expected = "Darren Lynn Bousman";
    String actual = d.getArtist();

    assertEquals(expected, actual);
  }

  @Test
  public void setArtist() {
    d.setArtist("James Cameron");

    String expected = "James Cameron";
    String actual = d.getArtist();

    assertEquals(expected, actual);
  }

  @Test
  public void getPublicationDate() {
    String expected = "02/09-2007";
    String actual = d.getPublicationDate();

    assertEquals(expected, actual);
  }

  @Test
  public void setPublicationDate() {
    d.setPublicationDate("05/09-2007");

    String expected = "05/09-2007";
    String actual = d.getPublicationDate();

    assertEquals(expected, actual);
  }
}