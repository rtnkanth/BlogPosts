package rtnk.springframework.blog.sortarraylist.comparator;


import java.util.ArrayList;
import java.util.Collections;

public class JobCandidateSorter {
    ArrayList<JobCandidate> jobCandidate = new ArrayList<>();

    public JobCandidateSorter(ArrayList<JobCandidate> jobCandidate) {
        this.jobCandidate = jobCandidate;
    }

    public ArrayList<JobCandidate> getSortedJobCandidateByAge() {
        Collections.sort(jobCandidate, JobCandidate.ageComparator);
        return jobCandidate;
    }

    public ArrayList<JobCandidate> getSortedJobCandidateByName() {
        Collections.sort(jobCandidate, JobCandidate.nameComparator);
        return jobCandidate;
    }
}
