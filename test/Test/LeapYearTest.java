package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Code.LeapYear;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class LeapYearTest {
    @Test
    public void test_2000() {
        LeapYear leap = new LeapYear();
        leap.setYear(2000);
        boolean actual=leap.isLeapYear();
        boolean expected = true;
        assertEquals(expected,actual);
    }
    
    @Test
    public void test_1700() {
        LeapYear leap = new LeapYear();
        leap.setYear(1700);
        boolean actual=leap.isLeapYear();
        boolean expected = false;
        assertEquals(expected,actual);
    }
    
    @Test
    public void test_1800() {
        LeapYear leap = new LeapYear();
        leap.setYear(1800);
        boolean actual=leap.isLeapYear();
        boolean expected = false;
        assertEquals(expected,actual);
    }
    
    @Test
    public void test_1900() {
        LeapYear leap = new LeapYear();
        leap.setYear(1900);
        boolean actual=leap.isLeapYear();
        boolean expected = false;
        assertEquals(expected,actual);
    }
    
    @Test
    public void test_2008() {
        LeapYear leap = new LeapYear();
        leap.setYear(2008);
        boolean actual=leap.isLeapYear();
        boolean expected = false;
        assertEquals(expected,actual);
    }
    
    @Test
    public void test_2012() {
        LeapYear leap = new LeapYear();
        leap.setYear(2012);
        boolean actual=leap.isLeapYear();
        boolean expected = false;
        assertEquals(expected,actual);
    }
    
    @Test
    public void test_2016() {
        LeapYear leap = new LeapYear();
        leap.setYear(2016);
        boolean actual=leap.isLeapYear();
        boolean expected = false;
        assertEquals(expected,actual);
    }
    
    @Test
    public void test_2017() {
        LeapYear leap = new LeapYear();
        leap.setYear(2017);
        boolean actual=leap.isLeapYear();
        boolean expected = false;
        assertEquals(expected,actual);
    }
    
    @Test
    public void test_2018() {
        LeapYear leap = new LeapYear();
        leap.setYear(2018);
        boolean actual=leap.isLeapYear();
        boolean expected = false;
        assertEquals(expected,actual);
    }
    
    @Test
    public void test_2019() {
        LeapYear leap = new LeapYear();
        leap.setYear(2019);
        boolean actual=leap.isLeapYear();
        boolean expected = false;
        assertEquals(expected,actual);
    }
    
}
