package com.smriti;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
  int days;
  long distance;
  long SpeedOfLight;
  int seconds;
  SpeedOfLight = 186000;
  System.out.print("Enter the number of days: ");
  Scanner sc = new Scanner(System.in);
  days = sc.nextInt();
  seconds = days* 24*60*60;
  System.out.println("Days converted into seconds: "+seconds );
  distance = SpeedOfLight * seconds;
  System.out.print("The distance travelled by the light in "+days);
  System.out.print(" days ");
  System.out.print(" is "+distance);
  System.out.print("kms");
    }
}
