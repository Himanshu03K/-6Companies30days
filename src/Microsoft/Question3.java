package Microsoft;

/*
                     Bulls and Cows
   You are playing the Bulls and Cows game with your friend.

You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info:

The number of "bulls", which are digits in the guess that are in the correct position.
The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position. Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.
Given the secret number secret and your friend's guess guess, return the hint for your friend's guess.

The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows. Note that both secret and guess may contain duplicate digits.



Example 1:

    Input: secret = "1807", guess = "7810"
    Output: "1A3B"
    Explanation: Bulls are connected with a '|' and cows are underlined:
     "1807"
       |
     "7810"
 */
public class Question3 {
    public String getHint(String secret, String guess) {
        int bull=0;
        int[] map=new int[10];
        char[] s=secret.toCharArray();
        char[] g=guess.toCharArray();
        for(int i=0;i<s.length;i++){
            int x=s[i]-'0';
            int y=g[i]-'0';
            if(s[i]-g[i]==0){
                bull++;
            }
            else{
                map[x]++;
                map[y]--;
            }
        }
        int sum=0;
        for(int num:map){
            if(num>0){
                sum+=num;
            }
        }
        return bull+"A"+(s.length-bull-sum)+"B";
    }
}
