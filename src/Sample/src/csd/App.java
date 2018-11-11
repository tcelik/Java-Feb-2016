/*----------------------------------------------------------------------------------------------------------------------
	Sabitler:

	- Sayı nokta içermiyorsa ve herhangi bir sonek almamışsa ve int türü sınırları içerisinde kalıyorsa
	int türden sabittir. Sınır dışında kalıyorsa error oluşur

	- Sayı nokta içermiyorsa ve L veya l soneklerinden birini almışsa long türdendir
		1L, 4000000000L

	- Sayı nokta içersin ya da içermesin D veya d soneklerinden birini almışsa double türdendir
		1D, 3.4D

	- Sayı nokta içeriyorsa ve hiç bir son ek almamışsa double türdendir
		3.5

	- Sayı nokta içersin ya da içermesin F veya f soneklerinden birini almışsa float türdendir
		2.3F, 4F

	- Tek tırnak içerisinde yazılan karakterlere char türden sabitler denir
		'a', 'z', '1'

	- Escape sequence karakterler:
	\n -> line feed (LF)
	\r -> carriage return (CR)
	\t -> horizontal tab
	\v -> vertical tab
	\0 -> null karakter
	\\ -> backslash
	\' -> Tek tırnak
	\" -> Çift tırnak (karakter sabiti olarak tek başına da kullanılabilir)

	- Tek tırnak içerisinde ters bölü u ile hexadecimal olarak sıra numarası yazıldığında karakter sabiti yazılmış
	olur
----------------------------------------------------------------------------------------------------------------------*/




/*----------------------------------------------------------------------------------------------------------------------
	Ters bölü karakteri karakter sabiti olarak iki tane ters bölü ile yazılmalıdır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        char ch = '\\';

        System.out.print(ch);
    }
}

