package cn.jsxwsl.maven.ssm.utlis;

import java.util.HashMap;
import java.util.Map;

public class LoginCodeUtil {
	
	public static final String BASE_CODE_CONTEXT = "http://192.168.2.149:8080/qrlogin/login/scan/";
	// ��ά��Ĭ��״̬
	public static final int CODE_STATE_DEFAULT = 0;
	// ��ά�뱻ɨ״̬
	public static final int CODE_STATE_SCANED = 1;
	// ��ά�뱻ɨ֮���״̬
	public static final int CODE_STATE_SCANED_AFTER = -1;
	// ��ά��ִ�е�¼֮���״̬
	public static final int CODE_STATE_LOGIN = 2;
	// ��ά��ȡ����¼֮���״̬
	public static final int CODE_STATE_CANCEL = -2;
	// ��ά��ʧЧ��״̬
	public static final int CODE_STATE_INVALID = -3;
	// ��ά��ʧЧʱ��
	public static final int INVALID_TIME = 60 *1000;
	
	
	private static Map<String, Integer> map = new HashMap<String, Integer>();
	
	public static Map<String, Integer> getMap(){
		return map;
	}
	
	public static void set(String key, int value){
		map.put(key, value);
	}
	
	public static void remove(String key){
		map.remove(key);
	}
	
	public static int get(String key){
		Integer value = map.get(key);
		
		if(value == null){
			return CODE_STATE_INVALID;
		}
		
		return value;
	}
	
	
	

}
