package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Recursion.Level2_practice_question;

public class ProjectTeams {
    static void findTeams(int[] arr, int index, int target, String team) {

        if (target == 0) {
            System.out.println("[" + team + "]");
            return;
        }

        if (index == arr.length || target < 0)
            return;

        String newTeam;

        if (team.isEmpty())
            newTeam = String.valueOf(arr[index]);
        else
            newTeam = team + "," + arr[index];

        findTeams(arr, index + 1, target - arr[index], newTeam);

        findTeams(arr, index + 1, target, team);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills, 0, target, "");
    }
}
