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
		System.out.println("");
		System.out.println("追加後");

		System.out.println("");

		//　出力パターン　1
/*		System.out.println("case 1");
		System.out.println("");
		
		map.forEach((key, val) -> {
		System.out.println(key );
		System.out.println(  val );
		System.out.println("");

		});  
		System.out.println("");
*/
		//　出力パターン　2
		System.out.println("case 2");
		System.out.println("");
      
		for(Entry<String, ArrayList<String>> entry : map.entrySet()){
			System.out.println(entry.getValue());
			for(String author:entry.getValue())
			System.out.println("  "+ author);
		}
		System.out.println("");
/*
		//　出力パターン　3
		System.out.println("case ");
		System.out.println("");

		for (String key : map.keySet()) {
			System.out.println(key);
			for (ArrayList<String> val : map.values()) {
				System.out.println(val);
			}
		}
*/

		return map;
	}	

}
