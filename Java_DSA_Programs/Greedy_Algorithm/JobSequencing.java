import java.util.*;

public class JobSequencing {

    static class Job {
        int id;
        int deadline;
        int profit;

        Job(int id, int d, int p) {
            this.id = id;
            this.deadline = d;
            this.profit = p;
        }
    }

    public static void main(String[] args) {

        int[][] jobsInfo = {
            {1, 4, 20},
            {2, 1, 10},
            {3, 1, 40},
            {4, 1, 30}
        };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(
                    jobsInfo[i][0],
                    jobsInfo[i][1],
                    jobsInfo[i][2]
            ));
        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("max jobs = " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}
