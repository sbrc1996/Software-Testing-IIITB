package org.example;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleParenthesis {
    public void generateValidParenthesis(int n, int opening , int closing,String ans,List<String> list){
        if(n == opening && n == closing){
            list.add(ans);
            return;
        }
        if(opening<n)
            generateValidParenthesis(n,opening+1,closing,ans+"(",list);
        if(opening>closing)
            generateValidParenthesis(n,opening,closing+1,ans+")",list);
    }

    public void generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateValidParenthesis(n,0,0,"",list);

        for(String s : list){
            System.out.print(s + ", ");
        }
    }

}
