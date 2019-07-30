//package com.ds.String;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LongestSubString {
//
//	static void Main(String[] args)     
//    {
//        //.         
//        String input = "aabbccdddxxxxxxxxxxxxxxxxx";
//        int max_chars = 2;
//
//        //.
//        int flip = 0;
//
//        List<String> scanned = new ArrayList<String>();
//
//        while (flip > -1)
//        {
//            scanned.Add(Scan(input, flip, ref flip));
//        }
//
//        String found = String.Empty;
//        for(int i=0;i<scanned.Count;i++)
//        {
//            var s = Condense(scanned, i, max_chars);
//            if (s.Length > found.Length)
//            { 
//                found = s;
//            }
//        }
//
//        System.Console.WriteLine("Found:" + found);
//        System.Console.ReadLine();
//
//
//    }
//
//	/// <summary>
//	///
//	/// </summary>
//	/// <param name="s"></param>
//	/// <param name="start"></param>
//	/// <returns></returns>
//	private static String Scan(String s, int start, ref int flip)
//    { 
//        StringBuilder sb = new StringBuilder();
//
//        flip = -1;
//
//        sb.Append(s[start]);
//
//        for (int i = start+1; i < s.Length; i++)
//        {
//            if (s[i] == s[i - 1]) { sb.Append(s[i]); continue; } else { flip=i; break;}
//        }
//
//        return sb.ToString();
//    }
//
//	/// <summary>
//	///
//	/// </summary>
//	/// <param name="list"></param>
//	/// <param name="start"></param>
//	/// <param name="repeat"></param>
//	/// <param name="flip"></param>
//	/// <returns></returns>
//	private static String Condense(List<String> list, int start, int repeat)
//    {
//        StringBuilder sb = new StringBuilder();
//
//        List<char> domain = new List<char>(){list[start][0]};
//
//        for (int i = start; i < list.Count; i++)
//        {
//            bool gap = false;
//
//            for (int j = 0; j < domain.Count; j++)
//            {
//                if (list[i][0] == domain[j])
//                { 
//                    sb.Append(list[i]);
//                    break;
//                }
//                else if (domain.Count < repeat)
//                {
//                    domain.Add(list[i][0]);
//                    sb.Append(list[i]);
//                    break;
//                }
//                else
//                {
//                    gap=true;
//                    break;
//                }
//            }
//
//            if (gap) { break;}
//        }
//
//        return sb.ToString();
//    }
//}
