class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String sent:sentences)
        {
            int len=sent.split(" ").length;
            max=Math.max(max,len);
        }
        return max;
        
    }
}
