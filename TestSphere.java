//******************************************************************************
// NAME: Instructor Wooster
// DATE: 6/5/20
// HOURS:
// CLASS: CSCI 200 Summer 2020
// ASSSIGNMENT: test program for program-ch04
// PURPOSE: test the Sphere class
//******************************************************************************
import java.util.*;

    public class TestSphere {

        public static void main (String args []) {

            Scanner scan = new Scanner(System.in);

            double dia;
            System.out.print("Enter diameter: ");
            dia=scan.nextDouble();
            Sphere s;
            s = new Sphere(dia);

            System.out.println(s);

            Sphere s2 = new Sphere(25.0);
            System.out.println(s2);

        }
    }
