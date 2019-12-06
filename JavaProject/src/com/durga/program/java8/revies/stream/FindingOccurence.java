package com.durga.program.java8.revies.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingOccurence {

	public static void main(String[] args) {

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		String path = "E:\\DK_Data\\Interview Data\\Company_Interview_Question.txt";
		try {

			Files.lines(Paths.get(path)).filter(filter -> !filter.isEmpty()).sorted()
					.map(mapper -> mapper.trim().replaceAll("\\s", "").split("")).flatMap(Arrays::stream)
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
					.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		try(Scanner scan = new Scanner(System.in))
		{
			System.out.println("Withut semilulan");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

/*
 * =8 !=3 "=24 %=2 '=4 (=35 )=35 +=115 ,=93 -=659 .=128 /=13 0=57 1=221 2=146
 * 3=105 4=71 5=56 6=47 7=53 8=54 9=39 :=3 ;=14 <=1 ==1462 >=2 ?=27
 * 
 * @=10 A=49 B=12 C=39 D=20 E=22 F=8 G=3 H=17 I=29 J=12 K=2 L=21 M=23 N=19 O=16
 * P=23 Q=3 R=15 S=56 T=19 U=4 V=7 W=24 X=1 Y=1 Z=3 [=2 ]=2 a=1618 b=239 c=626
 * d=639 e=2032 f=396 g=313 h=873 i=1418 j=92 k=167 l=679 m=445 n=1399 o=1297
 * p=453 q=35 r=1122 s=1052 t=1612 u=482 v=144 w=665 x=74 y=329 z=33
 */