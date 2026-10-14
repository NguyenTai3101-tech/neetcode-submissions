public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashMap = new HashMap<>();
        for (String s : strs){
            
            if (!hashMap.containsKey(sortString(s))){
                hashMap.put(sortString(s),new ArrayList<>());
            }
            hashMap.get(sortString(s)).add(s);
        }
        return new ArrayList<>(hashMap.values());
    }
}

public String sortString(String needChange) {
    char[] chars = needChange.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
}