//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
class ArrayIntersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> occurences = new HashMap<Integer, Integer>();
        ArrayList<Integer> commonElements = new ArrayList<Integer>();
        
        // add elements first array to HashMap
        int element;
        for(int i = 0; i < nums1.length; i++) {
            element = nums1[i];
            if (occurences.containsKey(element)) {
                occurences.put(element, occurences.get(element)+1);
            }
            else {
                occurences.put(element, 1);
            }
        }
        
        // add common elements to ArrayList
        for (int i = 0; i < nums2.length; i++) {
            element = nums2[i];
            if (occurences.containsKey(element) && occurences.get(element) > 0) {
                commonElements.add(element);
                occurences.put(element, occurences.get(element)-1);
            }
        }
        
        // return int array
        int answer[] = new int[commonElements.size()];
        for (int i = 0; i < commonElements.size(); i++) {
            answer[i] = commonElements.get(i);
        }
        
        return answer;
    }
}