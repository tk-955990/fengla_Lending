package fengla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

		ArrayList<Lending> lendingList = new ArrayList<Lending>();
		for(int i=0;i<ary.length;i++) {
			lendingList.add(ary[i]);        
		}
		for(Lending str: lendingList) {
			System.out.println("arraylist");  
			System.out.println(str);
		}		

		Map<String,ArrayList<String>> lendingMap = lendingRecord(lendingList);

	}
	
	private static Map<String, ArrayList<String>> lendingRecord(ArrayList<Lending> lendingList) {


		Map<String, ArrayList<String>> map = new HashMap<>();
		for(Lending lending : lendingList) {
			if(map.containsKey(lending.getBookTitle())) {
				ArrayList<String>names = 
						map.get(lending.getBookTitle());

				names.add(lending.getPersonName());

			}else {
				ArrayList<String>addName = 
						 new ArrayList<String>();		
				addName.add(lending.getPersonName());

				map.put(lending.getBookTitle(),addName);

			}
		}
		System.out.println("追加後");

		map.forEach((key, val) -> System.out.println(key + " : " + val));

		return map;
	}	

}
