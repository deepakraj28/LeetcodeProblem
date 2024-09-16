class Solution
{
    public int findMinDifference(List<String> timePoints)
    {
        int n = timePoints.size(), res = 720;
        int[] times = new int[n];
        for (int i = 0; i < timePoints.size(); i++)
        {
            String s = timePoints.get(i);
            times[i] = convert(s);
        }
        Arrays.sort(times);        
        for (int i = 1; i < n; i++)
        {
            res = Math.min(res, times[i] - times[i - 1]);
        }
        res = Math.min(res, times[0] + 1440 - times[n - 1]);
        return res;
    }
    private int convert(String s)
    {
        int value = (int) (s.charAt(4) - '0');
        value += (int) (s.charAt(3) - '0') * 10;
        value += (int) (s.charAt(1) - '0') * 60;
        value += (int) (s.charAt(0) - '0') * 600;
        return value;
    }
}