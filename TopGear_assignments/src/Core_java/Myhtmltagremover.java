package Core_java;

public class Myhtmltagremover
{
	public static String replace(String a[])
	{
		for(int i=0;i<a.length;i++)
		{
			String s=new String(a[i]);
			while(s.indexOf("<")!=-1)
			{
				if(s.indexOf(">")!=-1)
						{
							
							String x=s.substring(s.indexOf("<"), s.indexOf(">")+1);
							s=s.replace(x, "");
						}
			}
			System.out.println(s);
		}
		return null;
		
	}
	public static void main(String[] args) 
	{
	String a[]={"<B>I don't want this to be bold</B>", "I don't </head>wantt this to</body> be bold"};
	replace(a);
	}

}