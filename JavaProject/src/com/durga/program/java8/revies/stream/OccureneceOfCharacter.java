package com.durga.program.java8.revies.stream;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OccureneceOfCharacter {

	public static void main(String[] args) {
		
		String input = "I Love Java Programming";
		
		Stream<String> of = Stream.of(input);
		Stream<String[]> arrStreamMapper = of.map(mapper -> mapper.trim().replaceAll("\\s", "").split(""));
		Stream<String> flatMap = arrStreamMapper.flatMap(Arrays::stream);
		flatMap.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet().stream().forEach(System.out::println);
		
//		m1();
//		String s = null;
//		System.out.println(s+"");
//		System.out.println(null+"");
//		
		//Map<String, Long> collect7 = of.map(mapper -> mapper.trim().replaceAll("\\s", "").split("")).flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		of.close();
	}
	
	public static void m1()
	{
		InetAddress byName;
		try {
			byName = InetAddress.getByName("192.168.0.3");
			String hostName = byName.getHostName();
			System.out.println(hostName);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			InetAddress byName2 = Inet4Address.getByName("192.168.0.3");
			
			String hostName = byName2.getHostName();
			String hostAddress = byName2.getHostAddress();
			
			System.out.println(hostName+":"+hostAddress);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
