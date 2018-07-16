package cn.jsxwsl.maven.ssm.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component(value="logAspect")
public class LogAspect {

	public void before(JoinPoint joinPoint){
		Signature signature = joinPoint.getSignature();

		String tagerClass = signature.getDeclaringTypeName();
		String tagerMehtod = signature.getName();
		String out = " *** " + tagerClass + " *** " + tagerMehtod + " *** ";
		
		for( int i=0; i<out.length(); i++){ 
			System.out.print("*");
		}
		
		System.out.println();
		System.out.println( " *** controller before *** " );
		System.out.println(out);

		for( int i=0; i<out.length(); i++){
			System.out.print("*");
		}
		System.out.println();
		
	}

	public void after(){
		System.out.println( " *** controller after *** " );
		System.out.println( " *** controller after *** " );
		System.out.println( " *** controller after *** " );
	}
	
	
	
}
