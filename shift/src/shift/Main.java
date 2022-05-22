package shift;

//import java.util.Scanner;

public class Main {
	
	public static String shifter(String st,int n)
	{
		String s="";
		int a;
		for(int i=0;i<st.length();i++)
		{
			a=st.charAt(i);
			
			if(a<=90&&a>64)
			{
				a=a+n;
				if(a<=90)
				{
					s=s+(char)a;
				}
				else
				{
					a=(a+64)%90;
					s=s+(char)a;
				}
				
			}
			
			//ascii value of a=97 and z=122
			else if(a>96&&a<123)
			{
				a=a+n;
				if(a<123)
				{
					s=s+(char)a;
				}
				else
				{
					a=(a+96)%122;
					s=s+(char)a;
				}
			}
			else if(a>47&&a<58)
			{
				a=a+n;
				if(a<58)
				{
					s=s+(char)a;
				}
				else
				{
					a=(a+47)%57;
					s=s+(char)a;
				}
			}
			else
			{
				s=s+(char)a;
			}
		}
		return s;
	}
	
	
	public static void main(String[] args) {
		
		String st="Zensar@1y633569";
		int n=6;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string");
//		st=sc.nextLine();
//		System.out.println("Enter shift value");
//		n=sc.nextInt();
		System.out.println(st+"  String after shift   "+shifter(st,n));
		//sc.close();
		
	}

}
