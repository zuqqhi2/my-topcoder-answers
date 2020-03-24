public class AccessChanger {
    public String[] convert(String[] program) {
        for (int i = 0; i < program.length; i++) {
            String s = program[i];
            String ss = "";
            if (s.indexOf("//") != -1) {
                ss = s.substring(s.indexOf("//"));
                s = s.substring(0, s.indexOf("//"));
            }
            
            if (s.indexOf("->") != -1) {
                s = s.replaceAll("->", ".");
            }
            
            program[i] = s + ss;
        }
        
        return program;
    }
}

/*
Difficulty: Easy
Time: -
Point: -
Time Complexity: O(N)
Space Complexity: O(N)
Memo: I think I could solved but not passed all system test. so this is top solution.
*/