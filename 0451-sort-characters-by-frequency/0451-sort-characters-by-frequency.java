class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
       Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        StringBuilder res = new StringBuilder();
        for(char c : list){
        int freq = map.get(c);
        for(int i = 0; i < freq; i++){
            res.append(c);
        }
        }
        return res.toString();
    }
}