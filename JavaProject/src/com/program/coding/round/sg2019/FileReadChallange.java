//package com.program.coding.round.sg2019;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.time.Duration;
//import java.time.Instant;
//import java.util.*;
//import java.util.concurrent.ArrayBlockingQueue;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class FileReadChallange {
//
//	private String FILE_NAME = "itcont.txt";
//    private int WORKERS = 2;
//    private int BATCH_SIZE = 50000;
//    private String POISON = "quit";
//    private ArrayBlockingQueue<ArrayList<String>> queue = new ArrayBlockingQueue<>(1000);
//    private int lineCount = 0;
//    private List<String> names = Collections.synchronizedList(new ArrayList<String>());
//    private List<String> firstNames = Collections.synchronizedList(new ArrayList<String>());
//    private Map<String, Integer> donations = new ConcurrentHashMap<String, Integer>();
//
//    public static void main(String[] args) throws IOException, InterruptedException {
//        var m = new FileReadChallange();
//        m.run();
//    }
//
//    public void run() throws IOException, InterruptedException {
//        var threads = new ArrayList<Thread>(this.WORKERS);
//        for (int i = 0; i < this.WORKERS; i++) {
//            var processor = new Thread(this::processLines);
//            processor.start();
//            threads.add(processor);
//        }
//
//        try (var b = Files.newBufferedReader(Path.of(this.FILE_NAME))) {
//            var readLine = "";
//            var lines = new ArrayList<String>();
//
//            while ((readLine = b.readLine()) != null) {
//                this.lineCount++;
//                lines.add(readLine);
//
//                if (this.lineCount % this.BATCH_SIZE == 0) {
//                    this.queue.offer(lines);
//                    lines = new ArrayList<>();
//                }
//            }
//
//            var poisonList = new ArrayList<String>();
//            poisonList.add(POISON);
//            for (int i = 0; i < this.WORKERS; i++) {
//                this.queue.offer(poisonList);
//            }
//        }
//
//        for (var processor : threads) {
//            processor.join();
//        }
//    }
//
//    private void processLines() {
//        try {
//            while (true) {
//                var lines = this.queue.take();
//
//                if (lines.size() == 1 && lines.get(0).equals(POISON)) {
//                    return;
//                }
//
//                for (var line : lines) {
//                    var split = line.split("\\|", 9);
//
//                    this.names.add(split[7]);
//
//                    var ym = split[4].substring(0, 6);
//                    if (this.donations.containsKey(ym)) {
//                        // NB this is not thread safe! Didn't bother fixing
//                        this.donations.put(ym, this.donations.get(ym) + 1);
//                    } else {
//                        this.donations.put(ym, 0);
//                    }
//
//                    this.firstNames.add(this.extractFirstName(split[7]));
//                }
//            }
//        } catch (InterruptedException ignored) {
//        }
//    }
//
//    private String extractFirstName(String line) {
//        var inName = false;
//        var sb = new StringBuilder();
//
//        // To get the first name loop to the first space, then keep going till the end or the next space
//        for (var c : line.toCharArray()) {
//            if (c == ' ') {
//                if (inName) {
//                    return sb.toString();
//                }
//
//                inName = !inName;
//            } else {
//                if (inName) {
//                    sb.append(c);
//                }
//            }
//        }
//        return sb.toString();
//    }
//}
