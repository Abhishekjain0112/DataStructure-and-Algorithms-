/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course2DataStructure;

/**
 *
 * @author Abhishek
 */
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class JobQueue {
    private int numWorkers;
    private int[] jobs;

    private int[] assignedWorker;
    private long[] startTime;

    private FastScanner in;
    private PrintWriter out;

    public static void main(String[] args) throws IOException {
        new JobQueue().solve();
    }

    private void readData() throws IOException {
        numWorkers = in.nextInt();
        int m = in.nextInt();
        jobs = new int[m];
        for (int i = 0; i < m; ++i) {
            jobs[i] = in.nextInt();
        }
    }

    private void writeResponse() {
        for (int i = 0; i < jobs.length; ++i) {
            out.println(assignedWorker[i] + " " + startTime[i]);
        }
    }

    private class Worker implements Comparable<Worker> {
    	int index;
    	long processing;

    	public Worker(int index, long processing) {
    		this.index = index;
    		this.processing = processing;
    	}

    	public int compareTo(Worker that) {
    		if (this.processing < that.processing)	return -1;
    		if (this.processing > that.processing)	return +1;
    		
    		return this.index - that.index;
    	}
    }

    private void assignJobs() {
        assignedWorker = new int[jobs.length];
        startTime = new long[jobs.length];
        PriorityQueue<Worker> pq = new PriorityQueue<Worker>();
        for (int i = 0; i < numWorkers; i++) {
        	pq.offer(new Worker(i, 0));
                //pq.offer()
        }
        for (int i = 0; i < jobs.length; i++) {
        	int duration = jobs[i];
        	Worker bestWorker = pq.poll();
        	assignedWorker[i] = bestWorker.index;
            startTime[i] = bestWorker.processing;
            pq.offer(new Worker(bestWorker.index, bestWorker.processing + duration));
        }
    }

    public void solve() throws IOException {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        readData();
        assignJobs();
        writeResponse();
        out.close();
    }
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner() {
            reader = new BufferedReader(new InputStreamReader(System.in));
            tokenizer = null;
        }

        public String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}


/*
https://github.com/MarufHassan/coursera-data-structures-algorithms/blob/master/data-structures/week3_priority_queues_and_disjoint_sets/2_job_queue/JobQueue.java
*/

