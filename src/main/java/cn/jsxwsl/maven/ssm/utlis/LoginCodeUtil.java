package cn.jsxwsl.maven.ssm.utlis;

import java.util.HashMap;
import java.util.Map;

public class LoginCodeUtil {
	
	public static final String BASE_CODE_CONTEXT = "http://192.168.2.149:8080/qrlogin/login/scan/";
	// 二维码默认状态
	public static final int CODE_STATE_DEFAULT = 0;
	// 二维码被扫状态
	public static final int CODE_STATE_SCANED = 1;
	// 二维码被扫之后的状态
	public static final int CODE_STATE_SCANED_AFTER = -1;
	// 二维码执行登录之后的状态
	public static final int CODE_STATE_LOGIN = 2;
	// 二维码取消登录之后的状态
	public static final int CODE_STATE_CANCEL = -2;
	// 二维码失效的状态
	public static final int CODE_STATE_INVALID = -3;
	// 二维码失效时间
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
