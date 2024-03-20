package Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Language {

	public static void skillMatch(HashMap<String, ArrayList<String>>lang)
	{
		System.out.println("Person who has French as skill");
		Set<String>set= lang.keySet();
		Iterator<String>itr=set.iterator();
		
		while(itr.hasNext())
		{
			String key=itr.next();
			ArrayList<String> checklang = lang.get(key);		//
			if(checklang.contains("French"))
			
			System.out.println(key+" : "+lang.get(key));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, ArrayList<String>>lang=new HashMap<>();
		
		ArrayList<String>SanketLang=new ArrayList<>();
		SanketLang.add("English");
		SanketLang.add("Japanese");
		lang.put("Sanket", SanketLang);
		
		ArrayList<String>SagarLang=new ArrayList<>();
		SagarLang.add("French");
		SagarLang.add("Marathi");
		lang.put("Sagar", SagarLang);
		
		ArrayList<String>NishantLang=new ArrayList<>();
		NishantLang.add("Hindi");
		NishantLang.add("Gujrati");
		lang.put("Nishant", NishantLang);
		
		skillMatch(lang);
		
	}

}
