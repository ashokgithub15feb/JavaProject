package com.datastructures.company.epam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Leaderboard implements Runnable {

	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	public synchronized void addScore(int playerId, int score) {
		
		map.put(playerId, score);
	}
	
	public int top(int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(Map.Entry<Integer, Integer> en : map.entrySet()) {
			pq.add(en.getKey());
		}
		
		//Integer reduce = pq.stream().limit(k).reduce(0, (f1, f2) -> (map.get(f1).intValue() + map.get(f2).intValue()), Integer::sum);
		
		int sum = 0;
		
		Stream<Integer> limit = pq.stream().limit(k);
		
		List<Integer> collect = limit.collect(Collectors.toList());
		
		for(Integer i : collect) {
			sum = sum + map.get(i);
		}
		return sum;
	}
	
	public synchronized void reset(int playerId) {
		map.remove(playerId);
	}
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		executorService.execute(new Leaderboard());
		
		//1. addScore
		/*Leaderboard leaderboard = new Leaderboard();
		leaderboard.addScore(1,	73);
		leaderboard.addScore(2,	56);
		leaderboard.addScore(3,	39);
		leaderboard.addScore(4,	51);
		leaderboard.addScore(5,	4);
		System.out.println(leaderboard.map);
		
		//3. reset(id)
		leaderboard.map.remove(1);
				
		//2. Top(k)
		int top = leaderboard.top(3);
		System.out.println("Top Players: "+top);
		
		//3. reset(id)
		leaderboard.map.remove(1);
		
		System.out.println(leaderboard.map);
		
		*/
		
		executorService.shutdown();
		
	}

	@Override
	public void run() {
		
		Leaderboard leaderboard = new Leaderboard();
		leaderboard.addScore(1,	73);
		leaderboard.addScore(2,	56);
		leaderboard.addScore(3,	39);
		leaderboard.addScore(4,	51);
		leaderboard.addScore(5,	4);
		
		leaderboard.map.remove(1);
		
		int top = leaderboard.top(3);
		System.out.println("Top Players: "+top);
		
		leaderboard.map.remove(1);
		
	}
}
