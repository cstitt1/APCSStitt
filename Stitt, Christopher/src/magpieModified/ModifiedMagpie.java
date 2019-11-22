package magpieModified;

import java.util.*;

public class ModifiedMagpie
{
    // returns a list of positions of keyword in str
    // returns empty list if no such positions
    public static List<Integer> findKeyword(String str, String keyword)
    {
        List<Integer> res = new ArrayList<Integer>();
        int start = 0;
        
        while (str.indexOf(keyword, start) != -1) {
        	int index = str.indexOf(keyword, start);
        	res.add(index);
        	start = index + keyword.length();
        }
        
        return res;
    }
    
    // returns a list of positions of isolated occurrences of keyword in str
    // returns empty list if no such positions
    public static List<Integer> findIsolatedKeyword(String str, String keyword)
    {
        List<Integer> res = findKeyword(str, keyword);
        
        for (int i=0; i<res.size(); i++) {
        	
        }
    }
}