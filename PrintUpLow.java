/*
Object oriented programming Lab 2 question 2

Complete the main method in the PrintUpLow class by using a for loop to print strings of the form starting at "Aa" up to and including "Zz"  on separate lines of the console.
Use the Character.toUpperCase(char) method to obtain the uppercase of a letter.

For example:
Test	Result
PrintUpLow.main(new String[]{})	aA
bB
cC
dD
eE
fF
gG
hH
iI
jJ
kK
lL
mM
nN
oO
pP
qQ
rR
sS
tT
uU
vV
wW
xX
yY
zZ


starter code
public class PrintUpLow
{
    public static void main(String[] args)
    {
       
    }
}
*/

public class PrintUpLow 
{
	public static void main(String [] args  )
	{
		for (char c = 'a' ; c <= 'z' ; c++) // for loop starting at a ends with z
		{
			System.out.println(c+ "" +Character.toUpperCase(c)); // lowercase +Uppercase change of char c 
		}
	}
}
