/*----------------------------------------------------------------------------------------------------------------------
	Atomlar
	1. Keywords, reserved words (anahtar sözcük) (a.s.)
	2. Identifiers, variables (değişken) (d)
	3. Literals, constants (sabitler) (s)
	4. Operators (operatörler) (o)
	5. String ler (str)
	6. Delimiters, punctuators (ayraçlar) (a)
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Merhaba Java programının atomları:
	package			a.s
	csd				d
	;				a
	class			a.s.
	App				d
	{}				a
	public			a.s.
	static			a.s.
	void			a.s.
	main			d
	()				a
	String			d
	[]				a
	args			d
	System			d
	.				o
	out				d
	println			d
	()				o
	"Marhaba Java"	s
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Java da yorum satırları (comment line)
----------------------------------------------------------------------------------------------------------------------*/

package csd;

class App {
    public static void main(String [] args)
    {
        // bu kısım derleyici tarafından görünmez
        System.out.println("Merhaba Java"); // bu kısım da derleyici tarafından görünmez
		/*
			Burası da

			görünmez
		*/
    }
}
