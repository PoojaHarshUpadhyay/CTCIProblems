private boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                result = true;
                break;
            } else {
                set.add(nums[i]);
            }
        }
        return result;
    }
