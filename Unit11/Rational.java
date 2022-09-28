package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int e, s;
	
	public Rational() {
		setRational(1,1);
	}

	public Rational(int d, int f) {
		setRational(d,f);
	}


	//write a setRational method
	public void setRational(int a, int b) {
		e = a;
		s = b;
	}

	//write  a set method for numerator and denominator
	public void setNum(int num) {
		e = num;
	}
	
	public void setDen(int num) {
		s = num;
	}
	
	public void add(Rational  other)
	{
		e = (GetNum()*other.GetDen()+GetDen()*other.GetNum());
		s =	GetDen() * other.GetDen();	
		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(e,s);
		e = e/gcd;
		s = s/gcd;
	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd=1;
		for(int i=1; i<=numOne; i++) {
			if(numOne%i==0 && numTwo%i==0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public Rational clone ()
	{
		return new Rational(e,s);
	}


	public int GetNum() {
		return e;
	}
	public int GetDen() {
		return s;
	}
	
	public boolean equals( Rational obj)
	{
		reduce();
		(obj).reduce();
		if(GetNum()==obj.GetNum() && GetDen() == obj.GetDen()) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		if(equals(other)) {
			return 0;
		}
		else if((double)e/s - (double)other.GetNum()/other.GetDen() < 0) {
			return -1;
		}
		else
			return 1;
	}



	
	public String toString() {
		return e + "/" + s;
	}
	
	
}