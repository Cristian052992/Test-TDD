package Code;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class LeapYear {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public boolean isLeapYear()
    {
      if(this.year%400==0)
      {
          return true;
      }
      else if (this.year%100==0)
      {
          return false;
      }
      else if(this.year%4==0)
      {
          return false;
      }
      
      return false;
    }
    
}
