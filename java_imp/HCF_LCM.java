package java_imp;

public class HCF_LCM 
{

	public static void main(String[] args)
	{
		int num=12, HF=0;
		for(int i=num; i>1; i--)
		{
			if(num%i == 0)
				HF=i;
		}
		System.out.println(HF);
	}

}
