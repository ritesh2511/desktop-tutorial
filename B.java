package ritz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.*;
public class B {
	
	static long toDecimal(String s)
	{
		long num=0;
		int b=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			num = (num + ((long)Math.pow(2, b)*(s.charAt(i)-'0')));
			b++;
		}
		return num%1000003;
		       
	}
	
	public static void main(String[] args) {
		
		FastScanner fs = new FastScanner();
		
		String p = fs.next();
		String res="";
		for(int i=0;i<p.length();i++)
		{
			if(p.charAt(i)=='>')
				{
					
					res=res+"1000";
				}
			else if(p.charAt(i)=='<')
			{
				res+="1001";
			}
			
			else if(p.charAt(i)=='+')
			{
				res+="1010";
			}
			else if(p.charAt(i)=='-')
			{
				res+="1011";
			}
			else if(p.charAt(i)=='.')
			{
				res+="1100";
			}
			else if(p.charAt(i)==',')
			{
				res+="1101";
			}
			else if(p.charAt(i)=='[')
			{
				res+="1110";
			}
			else if(p.charAt(i)==']')
			{
				res+="1111";
			}
			
		}
		
		System.out.println(toDecimal(res));
	}
		
	
	
	
	static class FastScanner 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
	
	

}
