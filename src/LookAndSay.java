
public class LookAndSay {

	private String las="";      //okunmasý istenen sayi
	private String tempLas="";  //okuma iþlemi için geçici deðiþken
	
	public LookAndSay(String digit)
	{
		las=digit+" "; 
	}
	
	public void las()
	{
		int count = 1; //okunan rakamdan en az 1 tane vardýr.
		for (int i = 0; i < las.length()-1 ; i++)
		{
			if(las.charAt(i) == las.charAt(i+1)) 
			{
				count++; //okunan ile bir sonra ki eþitse count artar.
			}
			else
			{
				tempLas=tempLas+Integer.toString(count)+las.charAt(i);
				count=1;
			}
		}
		las = tempLas+" "; 
		tempLas = "";
	}
	
	public void display()
	{
		System.out.println(las.trim());
	}
	
}