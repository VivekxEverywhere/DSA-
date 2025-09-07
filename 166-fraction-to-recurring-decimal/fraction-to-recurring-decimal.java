class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        boolean isNegative = ((numerator>0 && denominator<0) || (denominator>0 && numerator<0)) ? true : false;
        StringBuilder ans = new StringBuilder();
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        long q = num/den;
        ans.append(q);
        long r = num%den;
        if(r==0) {
            if(isNegative) ans.insert(0, "-");
            return ans.toString();
        }
        else{
            ans.append(".");
            Map<Long,Integer> map = new HashMap<>();
            while(r!=0){
                if(map.containsKey(r)){
                    int index = map.get(r);
                    ans.insert(index, "(");
                    ans.append(")");
                    break;
                }
                else{
                    map.put((long)r,ans.length());
                    r = r*10;
                    q = r/den;
                    r = r%den;
                    ans.append(q);
                }
            }
        }
    if(isNegative) ans.insert(0, "-");
    return ans.toString();
    }
}