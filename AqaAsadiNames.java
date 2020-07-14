public class AqaAsadiNames {
    public String getName(String Dad, String Mom, String FirstChild, String Gender) {
        boolean isFCBoy = true;
        if (FirstChild.startsWith("A") || FirstChild.startsWith("E")
            || FirstChild.startsWith("I") || FirstChild.startsWith("O") 
            || FirstChild.startsWith("U") || FirstChild.startsWith("Y")) {
            isFCBoy = false;
        }
        
        if (isFCBoy && Gender.equals("Boy")) {
            return Dad.split(" ", 0)[0] + " " + FirstChild.split(" ", 0)[1];
        } else if (!isFCBoy && Gender.equals("Girl")) {
            return Mom.split(" ", 0)[0] + " " + FirstChild.split(" ", 0)[1];
        } else if (isFCBoy && Gender.equals("Girl")) {
            return Mom.split(" ", 0)[1] + " " + Mom.split(" ", 0)[0];
        } else {
            return Dad.split(" ", 0)[1] + " " + Dad.split(" ", 0)[0];
        }
    }
}

/*
Difficulty: Easy
Time: 00:15:59
Point: 195.91 of 250
Time Complexity: O(1)
Space Complexity: O(1)
Memo: -
*/