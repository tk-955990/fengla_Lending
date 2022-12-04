package fengla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
	public static void main(String args[]) {
		Lending[] ary = {
				new Lending("Java入門", "山田悟"),
				new Lending("HTML入門", "佐藤貴明"),
				new Lending("CSS入門", "斉藤ひかる"),
				new Lending("HTML入門", "横澤隆"),
				new Lending("Java入門", "高瀬美和"),
				new Lending("Java入門", "百瀬仁")
		};



		
		Map<String,String> lendingMap = lendingRecord(ary);

		
		
	}

	private static Map<String,String> lendingRecord(Lending[] ary) {
        List<Lending> list = Arrays.asList(ary);
	//	lendingList = Arrays.asList(ary);
        System.out.println("List = " + list);

		Map<String, String> map = new HashMap<>();
		for(Lending lending : ary) {
            map.put(lending.getBookTitle(),lending.getPersonName() );
        }
	   
	//	for(String val : map.values()){
		    System.out.println(map);
	//	}
		
//	Object[] mapkey = map.keySet().toArray();
//		Arrays.sort(mapkey);

	//	for (String nKey:map.keySet()) {
//
	//		System.out.println(map.get(nKey));
	//	}

		//		for (Lending e:ary) {
		//		System.out.println(e);
		//	}
		map.forEach((getBookTitle, getPersonName) -> System.out.println(getBookTitle + " : " + getPersonName));

		return map;
	}	

	/*		for (Lending e:ary) {
			if(map.containsKey(e.getBookTitle())) {
				map.put(e.getBookTitle(), e.getPersonName()  );
			}else{
				map.put(e.getBookTitle() );
			}
		} 

		for (Lending e:ary) {
			System.out.println(e);
		}
		return null;
	}
	 */



}
