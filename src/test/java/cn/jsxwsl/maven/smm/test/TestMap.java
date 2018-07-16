package cn.jsxwsl.maven.smm.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestMap {
	
	
	@Test
	public void test01(){
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("aa", 1);
		map.put("bb", 2);
		
		
		Integer i = map.get("aa");
		
		if( i == 1){
			System.out.println(i);
		}
		else if( i == 2){
			System.out.println(i);
		}
		else if( i == 3){
			System.out.println(i);
		}
		else if( i == 4){
			System.out.println(i);
		}
		
		
		
	}

}
