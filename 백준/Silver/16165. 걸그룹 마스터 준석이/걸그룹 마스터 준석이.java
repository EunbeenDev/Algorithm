import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int group = Integer.parseInt(st.nextToken());
        int ques = Integer.parseInt(st.nextToken());

        HashMap<String, String> memberToTeam = new HashMap<>();
        HashMap<String, ArrayList<String>> teamToMembers = new HashMap<>();

        for (int i = 0; i < group; i++) {
            String team = sc.nextLine();
            ArrayList<String> members = new ArrayList<>();

            int memberCount = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < memberCount; j++) {
                String member = sc.nextLine();
                members.add(member);
                memberToTeam.put(member, team);
            }
            Collections.sort(members);
            teamToMembers.put(team, members);
        }

        for (int i = 0; i < ques; i++) {

            String searchStr= sc.nextLine();
            int inputType = Integer.parseInt(sc.nextLine());

            if (inputType == 0) {
                // 특정 팀의 멤버 출력
                String teamName = searchStr;
                ArrayList<String> members = teamToMembers.get(teamName);
                for (String member : members) {
                    System.out.println(member);
                }
            } else {
                // 특정 멤버가 속한 팀 출력
                String memberName = searchStr;
                String teamName = memberToTeam.get(memberName);
                System.out.println(teamName);
            }
        }
    }
}
