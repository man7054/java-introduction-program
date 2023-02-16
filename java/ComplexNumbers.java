package Oops1.java;

import java.util.Scanner;

public class ComplexNumbers {
    public int real;
    public int imaginary;
    public ComplexNumbers(int real,int imaginary) {
    	this.real=real;
    	this.imaginary=imaginary;
    }
    public void plus(ComplexNumbers c2) {
    	this.real=this.real+c2.real;
    	this.imaginary=this.imaginary+c2.imaginary;
    }
    public void print() {
    	System.out.print(this.real+" + i"+this.imaginary);
    }
    public void multiply(ComplexNumbers c2) {
    	int r=this.real*c2.real-this.imaginary+c2.imaginary;
    	this.imaginary=this.imaginary*c2.real+this.real+c2.imaginary;
    	this.real=r;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}

	}

}
