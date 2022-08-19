package Ineuron;

public class SplitRev {

	public static void main(String [] args) {
		String s1=new String("Think Twice");
		String s2=new String("");
		String [] a=s1.split(" ");
		
		for(String w:a)
			 {
			String s2Words="";
			for(int i=(w.length()-1);i>=0;i--)
			{
				s2Words=s2Words+w.charAt(i);
				
			}
			s2=s2+s2Words+" ";
			//System.out.println(a.length);
			
	}
		System.out.println(s2);	
		}

}
