package typecasting;

public class casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		//String is predefined class name 
		short s = 30;
		//s is the name of the variable,here 30 is literal
		byte b = 40;
		//b is the name of the variable,here 40 is literal
        int I = (int)s + (int)b;
      //the value of short and byte are converted into int by using casting and these values are added,
    //then value is assigned to I
        System.out.println("value of int I is "+I);
		long L=(long)I + (long)s;
		//by taking long data type we are inserting the the values of integer  and short in them,
		//by adding we assign them in "l"
		System.out.println("value of long L is  "+L);
		float F = (float)I + (float)L; 
		//the values of long and int are converted into float by using casting and these values are added,
		//then the value is assigned to the variable of float that is F.
		System.out.println("value of float F is  "+F);
		double D =(double)F + (double)L;
		//the values of float and long are converted into long and these values are added ,
		//then the value is assigned to the variable of double that is "D".
		System.out.println("value of double D is  "+D);
		//system : system is a class in java language.lang package
				//out : out is the static member of system class.It's type PrintStream
				//println: which is used to print the output.
		       //Inside the brackets is value which to be printed	

	}

}
