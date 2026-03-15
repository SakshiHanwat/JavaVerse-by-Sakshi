class Day_0051_ConsecutiveCharacter_1446 {
    public int maxPower(String s) {
        int high = 1;
        int count = 1;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                count++;
            }else{
                count = 1;
            }
            high = Math.max(high, count);
        }

        return high;
    }
}
