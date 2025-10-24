class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String name = id_pw[0];
        String pw = id_pw[1];
        
        for(String[] d:db){
            if(d[0].equals(name)){ // id 동일 -> pw 확인 후 결과 return
                if(d[1].equals(pw)){return "login";}
                else{return "wrong pw";}
            }
        }
        return "fail";
    }
}